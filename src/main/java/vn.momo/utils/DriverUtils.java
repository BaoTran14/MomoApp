package vn.momo.utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverUtils {
    public static AndroidDriver initAndroidDriver() {
        //Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("deviceName", "Galaxy A500H API 23");
        caps.setCapability("automationName", "uiautomator2");
        caps.setCapability("deviceName", "6aa2d8ab");
//        caps.setCapability("udid", "6aa2d8ab"); //Give Device ID of your mobile phone
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "6.0.1");
        caps.setCapability("appPackage", "com.mservice.momotransfer");
        caps.setCapability("appActivity", "vn.momo.platform.MainActivity");
//        caps.setCapability("unicodeKeyboard", true);
        caps.setCapability("noReset", "true");
        caps.setCapability("newCommandTimeout", "300");
//        caps.setCapability("resetKeyboard", "true");
        try {
            return new AndroidDriver <>(new URL("http://localhost:4723/wd/hub"), caps);
        } catch (MalformedURLException e) {
            return null;
        }
    }
}
