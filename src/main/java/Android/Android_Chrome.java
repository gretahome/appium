package Android;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


import java.net.URL;

public class Android_Chrome {
    //public static final String MC_SERVER = "http://10.5.34.211:8080";

   // public static final String MC_SERVER_USER = "admin@default.com";

   // public static final String MC_SERVER_PASSWORD = "password";

    public static void main(String args[]) {

        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("udid", "0715f74de1dc1f3a");
            capabilities.setCapability("deviceName","SM-G920F");
            capabilities.setCapability("browserName", "chrome");
            capabilities.setCapability("userName","admin@default.com");
            capabilities.setCapability("password", "password");
            capabilities.setCapability("noReset", true);

           AndroidDriver wd = new AndroidDriver(new URL( "http://10.14.67.94:8080/wd/hub"), capabilities);

           String URL = "http://hpmc.coolpage.biz/";
            System.out.println("MC session was successfully created [Android Device]");

            wd.navigate().to(URL);
            wd.findElementByPartialLinkText("CGI's").click();
            ExpectedConditions.visibilityOfElementLocated(By.linkText("Example 1"));
            wd.navigate().back();
            ExpectedConditions.visibilityOfElementLocated(By.linkText("\"Web objects collection\""));

            wd.navigate().to("http://hpmc.coolpage.biz/tables/AutoTestTable.html");
            ExpectedConditions.urlContains("http://hpmc.coolpage.biz/tables/AutoTestTable.html");
            ExpectedConditions.urlToBe("http://hpmc.coolpage.biz/tables/AutoTestTable.html");


             Select s  = new Select(wd.findElement(By.id("D1")));
             s.selectByIndex(2);

            if (s.getFirstSelectedOption().getText() != "item 3")
            {
                Assert.fail("Fail to select value by SelectByIndex method!");
            }

            //SelectElement.SelectByText
            s.selectByVisibleText("item 2");
            if (s.getFirstSelectedOption().getText() != "item 2")
            {
                Assert.fail("Fail to select value by SelectByText method!");
            }

            //FindElementByCssSelector
            wd.findElementByCssSelector("input[type=radio][value=V2]").click();

            ExpectedConditions.elementToBeSelected(wd.findElementByCssSelector("input[type=radio][value=V2]"));


            wd.quit();
        } catch (Exception e) {
            System.out.println("Test failed.");
            e.printStackTrace();
        }


    }
}
