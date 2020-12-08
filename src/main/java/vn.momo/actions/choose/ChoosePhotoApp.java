package vn.momo.actions.choose;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class ChoosePhotoApp implements Interaction {
    @Override
    public <T extends Actor> void performAs(T theUser) {
//        String photoApp = System.getProperty("user.dir")+"\\src\\test\\resources\\image\\photoApp.jpg";
//        File file = new File(photoApp);
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
