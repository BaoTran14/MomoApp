package vn.momo.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import vn.momo.model.Environment;
import vn.momo.questions.AnnouceText;
import vn.momo.questions.displayof.DisplayOf;
import vn.momo.ui.IntroductionScreen;
import vn.momo.ui.WelcomeScreen;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SerenityRunner.class)
public class LoginStory {

    private static Environment environment = Environment.instance();
    @Managed(uniqueSession = true, driver = "Appium")
    public WebDriver herBrowser;
    private Actor anna = Actor.named("Anna");

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void explore_momo() {

        when(anna).attemptsTo(
                Click.on(IntroductionScreen.EXPLORE_NOW_BUTTON)
        );

        then(anna).should(seeThat(
                DisplayOf.PhoneRequestScreen.withTitle(), equalTo("Nhập số điện thoại")
                )
        );

        andThat(anna).should(seeThat(
                DisplayOf.PhoneRequestScreen.withContent(), equalTo("Dùng số điện thoại để đăng ký hoặc" + "\nđăng nhập Ví MoMo"))
        );
    }

    @Test
    public void log_in_success_with_valid_credential() {
        when(anna).attemptsTo(
                Enter.theValue(environment.PASSWORD).into(WelcomeScreen.PASSWORD_FIELD),
                Click.on(WelcomeScreen.LOGIN_BUTTON)
        );

        then(anna).should(
                seeThat(
                        AnnouceText.ofMoney(), equalTo("Số dư trong ví")
                )
        );
    }
}