package Android;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.net.URL;

public class TestAppAppiumAMB {
    //public static final String MC_SERVER = "http://10.5.34.211:8080";

   // public static final String MC_SERVER_USER = "admin@default.com";

   // public static final String MC_SERVER_PASSWORD = "password";
        public  AndroidDriver wd = null;

    public AndroidDriver CreateCapability()
    {

        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("udid", "LGH8702e4953f8");
            capabilities.setCapability("deviceName","LGE LG-H870");
            capabilities.setCapability("appPackage", "com.sample.UICatalog");
            capabilities.setCapability("appActivity", "com.sample.UICatalog.Menu");
            capabilities.setCapability("userName","admin@default.com");
            capabilities.setCapability("password", "password");
            capabilities.setCapability("noReset", true);
            //capabilities.setCapability("mcWorkspace", true);
            capabilities.setCapability("automationName", "Espresso");

             wd = new AndroidDriver(new URL( "http://10.14.57.42:8080/wd/hub"), capabilities);
            System.out.println("MC session was successfully created [Android Device]");
            return wd;

        } catch (Exception e) {
            System.out.println("Test failed.");
            e.printStackTrace();
        }
        return wd;

    }


    @AfterClass
    public void teardown()
    {
        wd.quit();
        System.out.println("end test");
    }

    @Test
    public void TestRestapp(){

        //AndroidDriver wd = new AndroidCapability().CreateUICatalogCapability("HUAWEI EVA-L09","MWS0216420006566");
        AndroidDriver wd = CreateCapability();
        WebElement e = wd.findElementByXPath("//*[contains(@text, 'TextAndButtons')]");
        e.click();
        WebElement dummyEditBOX =  wd.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.EditText\")"));
        dummyEditBOX.click();

       //Assert.assertTrue(boolean.parse(dummyEditBOX.getAttribute("focused")), "Failed because expected that 'email' control is focused.");

        String msg = "mctesting";
        dummyEditBOX.sendKeys(msg);

        Assert.assertEquals(dummyEditBOX.getAttribute("text").trim().toLowerCase(), msg,"Failed to send text value into 'dummy text' control.");

        wd.hideKeyboard();

        try
        {
            dummyEditBOX.clear();
        }
        catch (Exception ex)
        {

            Assert.fail("Failed to clear text value in 'dummy text' control. Exception:\n '{0}'");

        }
        wd.resetApp();

    }

    @Test
    public void DeviceInfoTest() throws Exception{
        AndroidDriver driver = CreateCapability();

        System.out.println("++++++++++++++++++++");
       // System.out.println(driver.getPerformanceData("com.sample.UICatalog","cpuinfo",5));

        WebDriverWait wait = new WebDriverWait(driver,10);

        System.out.println(driver.getSupportedPerformanceDataTypes());
        System.out.println("++++++++++++++++++++");
        System.out.println(driver.getPerformanceData("com.sample.UICatalog", "memoryinfo", 10));
        System.out.println(driver.getPerformanceData("com.sample.UICatalog", "batteryinfo", 10));
        System.out.println(driver.getPerformanceData("com.sample.UICatalog", "networkinfo", 10));
        Thread.sleep(3000);

    }

    public static void scrollTo_Android(AndroidDriver<WebElement> driver, String text)
    {
        String uiScrollables = UiScrollable("new UiSelector().textContains(\"" + text + "\")");
        driver.findElementByAndroidUIAutomator(uiScrollables);
    }
    public static void scrollToExact_Android(AndroidDriver<WebElement> driver, String text)
    {
        String uiScrollables = UiScrollable("new UiSelector().text(\"" + text + "\")");
        driver.findElementByAndroidUIAutomator(uiScrollables);
    }

    private static String UiScrollable(String uiSelector)
    {
        return "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(" + uiSelector + ".instance(0));";
    }


}
