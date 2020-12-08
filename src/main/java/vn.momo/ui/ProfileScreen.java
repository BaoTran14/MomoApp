package vn.momo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProfileScreen {
    public static Target SELECT_GALLERY = Target.the("gallery option").located(By.xpath("//android.widget.TextView[@text='Chọn từ bộ sưu tập ảnh']"));
    public static Target INTRODUCTION_LABEL = Target.the("introduction label").located(By.xpath("//android.widget.TextView[@text='Giới thiệu']"));
    public static Target SUCCESS_NOTIFICATION = Target.the("success notification").located(By.xpath("//android.widget.TextView[@text='Hoàn tất']"));
    public static Target INTRODUCTION_EDIT_BUTTON = Target.the("introduction edit button").located(By.xpath("(//*[@text='Chỉnh sửa'])[1]"));
}
