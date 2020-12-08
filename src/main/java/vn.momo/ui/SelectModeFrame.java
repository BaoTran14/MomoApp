package vn.momo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectModeFrame {
    public static Target PUBLIC_MODE = Target.the("public mode").located(By.xpath("//*[@text='Tất cả mọi người trên MoMo']"));
    public static Target FRIENDS_MODE = Target.the("friends mode").located(By.xpath("//*[@text='Bạn bè của bạn trên MoMo']"));
    public static Target ONLY_ME_MODE = Target.the("friends mode").located(By.xpath("//*[@text='Chỉ mình tôi']"));
}
