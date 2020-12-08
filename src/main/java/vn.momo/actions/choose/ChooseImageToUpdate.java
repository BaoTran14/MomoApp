package vn.momo.actions.choose;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import vn.momo.actions.PushFileToRemoteDevice;
import vn.momo.ui.PhotoApp;

public class ChooseImageToUpdate implements Interaction {
    @Override
    public <T extends Actor> void performAs(T theUser) {
        Target TARGET_FOLDER = Target.the("target folder").located(By.xpath("//android.widget.TextView[@text='" + PushFileToRemoteDevice.targetFolder + "']"));
        theUser.attemptsTo(
                Click.on(TARGET_FOLDER),
                Click.on(PhotoApp.Library.PROFILE_IMAGE)
        );
//        Screen screen = new Screen();
//        try {
//            screen.find(PushFileToRemoteDevice.imagePath);
//            screen.click(PushFileToRemoteDevice.imagePath);
//        } catch (FindFailed findFailed) {
//            findFailed.printStackTrace();
//        }
//        File file = new File(PushFileToRemoteDevice.imagePath);
//        Path path = file.toPath();
//        String imageBase64 = null;
//        try {
//            imageBase64 = Base64.getEncoder().encodeToString(Files.readAllBytes(path));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        WebDriver facade = BrowseTheWeb.as(theUser).getDriver();
//        WebDriver driver = ((WebDriverFacade) facade).getProxiedDriver();
//        ((AndroidDriver) driver).findElementByImage(imageBase64).click();
    }
}
