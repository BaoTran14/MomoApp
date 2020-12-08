package vn.momo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WelcomeScreen {
    public static Target PASSWORD_FIELD = Target.the("password field").located(By.xpath("//android.widget.EditText[@text='Nhập mật khẩu']"));
    public static Target LOGIN_BUTTON = Target.the("log in button").located(By.xpath("//android.widget.TextView[@text='ĐĂNG NHẬP']"));
    public static Target TITLE = Target.the("title of welcome screen").located(By.xpath("//android.widget.TextView[@index='0']"));
}
