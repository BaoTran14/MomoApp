package vn.momo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PhotoApp {
    public interface Library {
        Target PROFILE_IMAGE = Target.the("profile image").located(By.xpath("//android.view.ViewGroup[@content-desc='Ảnh được chụp vào 03-05-2018 22:49:33']"));
    }
}
