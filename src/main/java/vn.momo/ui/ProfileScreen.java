package vn.momo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProfileScreen {
    public static Target SELECT_GALLERY = Target.the("gallery option").located(By.xpath("//android.widget.TextView[@text='Chọn từ bộ sưu tập ảnh']"));
    public static Target INTRODUCTION_LABEL = Target.the("introduction label").located(By.xpath("//android.widget.TextView[@text='Giới thiệu']"));
    public static Target SUCCESS_NOTIFICATION = Target.the("success notification").located(By.xpath("//android.widget.TextView[@text='Hoàn tất']"));
    public static Target INTRODUCTION_EDIT_BUTTON = Target.the("introduction edit button").located(By.xpath("(//*[@text='Chỉnh sửa'])[1]"));
    public static Target SCREEN_TITLE_LABEL = Target.the("screen title label").located(By.xpath("//*[@text='Trang cá nhân của tôi']"));
    public static Target PRIVACY_EDIT_BUTTON = Target.the("privacy edit button").located(By.xpath("(//*[@text='Chỉnh sửa'])[3]"));
    public static Target PRIVACY_LABEL = Target.the("privacy label").located(By.xpath("//*[@text()='Riêng tư']"));
    public static Target SELECT_CAMERA = Target.the("camera option").located(By.xpath("//*[@text='Chụp hình']"));
}
