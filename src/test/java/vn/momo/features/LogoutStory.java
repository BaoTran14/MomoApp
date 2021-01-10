package vn.momo.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import vn.momo.model.Environment;
import vn.momo.questions.displayof.DisplayOf;
import vn.momo.tasks.Login;
import vn.momo.ui.LogoutConfirmPopup;
import vn.momo.ui.MomoScreen;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SerenityRunner.class)
public class LogoutStory {
    private Actor anna = Actor.named("Anna");
    private Environment environment = Environment.instance();

    @Managed
    WebDriver herDriver;

    @Before
    public void annaCanOpenMomo() {
        anna.can(BrowseTheWeb.with(herDriver));
    }

    @Test
    public void log_out_account() {
        givenThat(anna).wasAbleTo(Login.withPhoneNumber(environment.PHONE_NUMBER).andPassword(environment.PASSWORD));

        when(anna).attemptsTo(
                Click.on(MomoScreen.LOGOUT_ICON),
                Click.on(LogoutConfirmPopup.AGREE_BUTTON)
        );

        then(anna).should(
                seeThat(DisplayOf.WelcomeScreen.withTitle(), equalTo("Xin chào!"))
        );
    }
}
