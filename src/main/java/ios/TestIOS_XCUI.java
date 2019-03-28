package ios;

import io.appium.java_client.ios.IOSDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestIOS_XCUI {
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
        capabilities.setCapability("udid", "fcc5e2f33f4da89ee09e43fd17f86780f4ab70a5");
        capabilities.setCapability("bundleId", "com.hpe.advantage");
        capabilities.setCapability("deviceName", "Apple iPhone 7");
        capabilities.setCapability("automationName", "XCUITest");
        //capabilities.setCapability("source", "SRF");
//        wdaLocalScheme
       // capabilities.setCapability("wdaLocalScheme", "http");

   //     capabilities.setCapability("userName", MC_SERVER_USER);
  //      capabilities.setCapability("password", MC_SERVER_PASSWORD);
//        capabilities.setCapability("noReset", true);

        IOSDriver driver = null;
        try {

            driver = new IOSDriver(new URL("http://10.14.67.94:8080/wd/hub/"), capabilities);



            WebElement button =  driver.findElementById("LOGIN");
            System.out.print("button click");
            button.click();
            WebElement saveBtn = driver.findElementById("ACCOUNTS");

            saveBtn.click(); //Expand menu


            Assert.assertEquals("Failed to get ''label attribute ,expected value to be -'Accounts'","ACCOUNTS",saveBtn.getAttribute("label"));
           // driver.removeApp("com.hpe.advantage");
            driver.quit();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }



    }
}
