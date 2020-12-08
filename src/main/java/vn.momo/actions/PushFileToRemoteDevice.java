package vn.momo.actions;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import vn.momo.model.GetCurrentDriver;

import java.io.File;
import java.io.IOException;

public class PushFileToRemoteDevice implements Interaction {
    public static String imagePath;
    public static String targetFolder;

    public PushFileToRemoteDevice(String imgPath) {
        this.imagePath = imgPath;
    }

    @Step("{0} had image to update")
    @Override
    public <T extends Actor> void performAs(T theUser) {
        String remotePath = "storage/emulated/0/Pictures/profile.jpg";
        targetFolder = remotePath.split("0/")[1].split("/")[0];
        WebDriver driver = GetCurrentDriver.usedBy(theUser);
        try {
            ((AndroidDriver) driver).pushFile(remotePath, new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
