package Android;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class TestAppAppium_v1 {
    //public static final String MC_SERVER = "http://10.5.34.211:8080";

   // public static final String MC_SERVER_USER = "admin@default.com";

   // public static final String MC_SERVER_PASSWORD = "password";

    public static void main(String args[]) {

        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("deviceName","LGE LG-H870");
            capabilities.setCapability("appPackage", "com.android.settings");
            capabilities.setCapability("appActivity", "com.android.settings.Settings");
            capabilities.setCapability("userName","admin@default.com");
            capabilities.setCapability("password", "password");
            capabilities.setCapability("noReset", true);

           AndroidDriver wd = new AndroidDriver(new URL( "http://10.14.57.42:8080/wd/hub"), capabilities);
            System.out.println("MC session was successfully created [Android Device]");

            WebElement e = wd.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Bluetooth\")"));
            e.click();
            wd.quit();
        } catch (Exception e) {
            System.out.println("Test failed.");
            e.printStackTrace();
        }


    }
}
