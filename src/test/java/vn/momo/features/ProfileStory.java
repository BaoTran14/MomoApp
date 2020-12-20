package vn.momo.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import vn.momo.actions.Have;
import vn.momo.model.Environment;
import vn.momo.model.Mode;
import vn.momo.questions.displayof.DisplayOf;
import vn.momo.tasks.Login;
import vn.momo.tasks.change.Change;
import vn.momo.tasks.navigate.Navigate;
import vn.momo.tasks.start.Start;
import vn.momo.tasks.update.Update;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.is;

@RunWith(SerenityRunner.class)
public class ProfileStory {
    private static Environment environment = Environment.instance();
    @Managed
    WebDriver herDriver;
    private Actor anna = Actor.named("Anna");

    @Before
    public void annaCanLoginHerMomo() {
        anna.can(BrowseTheWeb.with(herDriver))
                .wasAbleTo(Login.withPhoneNumber(environment.PHONE_NUMBER).andPassword(environment.PASSWORD));
    }

    @Test
    public void update_her_avatar() {
        String imgPath = System.getProperty("user.dir") + "\\src\\test\\resources\\image\\profile.jpg";
        givenThat(anna).wasAbleTo(Navigate.toProfileScreen());
        andThat(anna).wasAbleTo(Have.imageToUpdate(imgPath));

        when(anna).attemptsTo(
                Change.profileImage()
        );

        then(anna).should(
                seeThat(
                        DisplayOf.successfulUpdateMessage(), is(true)
                )
        );
    }

    @Test
    public void update_intimate_name_to_public() {
        givenThat(anna).wasAbleTo(Navigate.toIntroduceHerSelfScreen());
        andThat(anna).wasAbleTo(Start.withIntimateName("BaoBupBe"));

        when(anna).attemptsTo(
                Update.theIntimateName("Bảo Bảo")d
                        .to(Mode.PUBLIC)
        );

        then(anna).should(
                seeThat(
                        DisplayOf.successfulUpdateMessage(), is(true)
                )
        );
    }

    @Test
    public void update_intimate_name_to_friends() {
        givenThat(anna).wasAbleTo(Navigate.toIntroduceHerSelfScreen());
        andThat(anna).wasAbleTo(Start.withIntimateName("BaoBupBe"));

        when(anna).attemptsTo(
                Update.theIntimateName("Bảo Bảo")
                        .to(Mode.FRIENDS)
        );

        then(anna).should(
                seeThat(
                        DisplayOf.successfulUpdateMessage(), is(true)
                )
        );
    }

    @Test
    public void update_intimate_name_to_only_me() {
        givenThat(anna).wasAbleTo(Navigate.toIntroduceHerSelfScreen());
        andThat(anna).wasAbleTo(Start.withIntimateName("BaoBupBe"));

        when(anna).attemptsTo(
                Update.theIntimateName("Bảo Bảo")
                        .to(Mode.ONLY_ME)
        );

        then(anna).should(
                seeThat(
                        DisplayOf.successfulUpdateMessage(), is(true)
                )
        );
    }

    @Test
    public void update_current_home_location_to_public(){
        givenThat(anna).wasAbleTo(Navigate.toIntroduceHerSelfScreen());
        andThat(anna).wasAbleTo(Start.withHomeLocationIs("Cần Thơ"));

        when(anna).attemptsTo(
                Update.currentHomeLocation("Hà Nội")
                        .to(Mode.PUBLIC)
        );

        then(anna).should(
                seeThat(
                        DisplayOf.successfulUpdateMessage(), is(true)
                )
        );
    }

    @Test
    public void update_current_home_location_to_friends(){
        givenThat(anna).wasAbleTo(Navigate.toIntroduceHerSelfScreen());
        andThat(anna).wasAbleTo(Start.withHomeLocationIs("Cần Thơ"));

        when(anna).attemptsTo(
                Update.currentHomeLocation("Đồng Tháp")
                        .to(Mode.FRIENDS)
        );

        then(anna).should(
                seeThat(
                        DisplayOf.successfulUpdateMessage(), is(true)
                )
        );
    }

    @Test
    public void update_current_home_location_to_only_me(){
        givenThat(anna).wasAbleTo(Navigate.toIntroduceHerSelfScreen());
        andThat(anna).wasAbleTo(Start.withHomeLocationIs("Cần Thơ"));

        when(anna).attemptsTo(
                Update.currentHomeLocation("Đà Nẵng")
                        .to(Mode.ONLY_ME)
        );

        then(anna).should(
                seeThat(
                        DisplayOf.successfulUpdateMessage(), is(true)
                )
        );
    }

}
