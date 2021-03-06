package ios;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestIOS_UIA {
    public static final String MC_SERVER = "http://192.168.1.102:8080";

    public static final String MC_SERVER_USER = "admin@default.com";

    public static final String MC_SERVER_PASSWORD = "password";

    public static void main(String args[]) {

        TestIOS_UIA();
    }


    public static void TestIOS_UIA() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        String testAPP = "com.mf.SimpleApp";

        capabilities.setCapability("userName", "admin@default.com");
        capabilities.setCapability("password", "password");
        capabilities.setCapability("udid", "03a68a98358f9be50c2b8c49bc600ed95642a172");
        capabilities.setCapability("bundleId", "com.hpe.advantage");
        capabilities.setCapability("deviceName", "Apple iPhone SE");
        capabilities.setCapability("automationName", "UIAutoamtion");
//        wdaLocalSchem
//      capabilities.setCapability("wdaLocalScheme", "http");

   //     capabilities.setCapability("userName", MC_SERVER_USER);
  //      capabilities.setCapability("password", MC_SERVER_PASSWORD);
//        capabilities.setCapability("noReset", true);

        IOSDriver driver = null;
        try {

            driver = new IOSDriver(new URL("http://10.14.65.42:8080/wd/hub/"), capabilities);


            WebElement button =  driver.findElementById("LOGIN");
            button.click();
           // driver.getPerformanceData();
            WebElement saveBtn = driver.findElementById("ACCOUNTS");

            saveBtn.click(); //Expand menu

            Assert.assertEquals("Failed to get ''label attribute ,expected value to be -'Accounts'","ACCOUNTS",saveBtn.getAttribute("label"));
            driver.quit();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }



    }
}
