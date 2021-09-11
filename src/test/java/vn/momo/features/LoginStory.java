package vn.momo.features;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
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
import vn.momo.utils.DriverUtils;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SerenityRunner.class)
public class LoginStory {
    private Actor anna = Actor.named("Anna");
    private Actor supplier = Actor.named("momo");
    private Environment environment = Environment.instance();

    @Managed(driver="chrome")
    WebDriver webDriver;

    @Managed(driver = "Appium")
    WebDriver herBrowser;

    @Managed
    AndroidDriver androidDriver = DriverUtils.initAndroidDriver();


    @Before
    public void annaCanBrowseTheWeb() {
//        anna.can(BrowseTheWeb.with(herBrowser));
        anna.can(BrowseTheWeb.with(androidDriver));
        supplier.can(BrowseTheWeb.with(webDriver));
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
        givenThat(supplier).attemptsTo(
                Open.url("https://momo.vn")
        );

        when(anna).attemptsTo(
//                WaitUntil.the(WelcomeScreen.PHONE_FIELD, isVisible()).forNoMoreThan(60).seconds(),
//                Enter.theValue(environment.PHONE_NUMBER).into(WelcomeScreen.PHONE_FIELD)
                WaitUntil.the(WelcomeScreen.PASSWORD_FIELD, isVisible()).forNoMoreThan(60).seconds(),
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