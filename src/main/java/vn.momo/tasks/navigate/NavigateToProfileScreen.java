package vn.momo.tasks.navigate;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import vn.momo.ui.FooterFrame;
import vn.momo.ui.MyWalletScreen;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class NavigateToProfileScreen implements Task {
    @Step("{0} navigates to her profile screen")
    @Override
    public <T extends Actor> void performAs(T theUser) {
        theUser.attemptsTo(
                WaitUntil.the(FooterFrame.MY_WALLET_CATEGORY, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(FooterFrame.MY_WALLET_CATEGORY),
//                MoveMouse.to(MyWalletScreen.PROFILE).andThen(Actions::click)
                Click.on(MyWalletScreen.PROFILE)
        );
    }
}
