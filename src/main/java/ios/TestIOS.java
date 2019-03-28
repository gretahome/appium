package ios;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestIOS {
    public static final String MC_SERVER = "http://10.5.34.217:8080";

    public static final String MC_SERVER_USER = "admin@default.com";

    public static final String MC_SERVER_PASSWORD = "Welcome1";

    public static void main(String args[]) {
        AndroidDriver wd = null;
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("udid", "V89HHI7S4PHYTG89");
            capabilities.setCapability("appPackage", "com.microfocus.silktest.testapp");
            capabilities.setCapability("appActivity", "com.microfocus.silktest.testapp.MainActivity");
            capabilities.setCapability("userName", MC_SERVER_USER);
            capabilities.setCapability("password", MC_SERVER_PASSWORD);
            capabilities.setCapability("noReset", true);

            wd = new AndroidDriver(new URL(MC_SERVER + "/wd/hub"), capabilities);
            System.out.println("MC session was successfully created [Android Device]");
            WebDriverWait waitController = new WebDriverWait(wd, 60);
            wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            // wd.findElementById("Web View One").click();
            System.out.println(wd.getPageSource());
            /*
             * HashMap<String, String> encoding= new HashMap<String, String>();
             *
             * encoding.put("encoding", "UTF-8");
             *
             * String logFileContents = (String)
             * wd.executeScript("hpe-wd: downloadLogs", encoding);
             *
             *
             * System.out.println(logFileContents);
             */
            System.out.println("Test completed.");

        } catch (Exception e) {
            System.out.println("Test failed.");
            e.printStackTrace();
        } finally {
            if (wd != null) {
                System.out.println("MC session closed.");
                wd.quit();
            }
        }

    }
}
