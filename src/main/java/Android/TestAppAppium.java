package Android;

import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import Resources.AndroidCapability;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.format.Parser;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestAppAppium {

        public  AndroidDriver wd = null;

    public AndroidDriver CreateCapability()
    {

        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            //capabilities.setCapability("udid", "LGH8702e4953f8");
           // capabilities.setCapability("deviceName","LGE LG-H870");
            capabilities.setCapability("appPackage", "com.sample.UICatalog");
            capabilities.setCapability("appActivity", "com.sample.UICatalog.Menu");
            capabilities.setCapability("userName","admin@default.com");
            capabilities.setCapability("password", "password");
            capabilities.setCapability("noReset", true);
            //capabilities.setCapability("automationName", "Espresso");
            //capabilities.setCapability("mcWorkspace", true);

             wd = new AndroidDriver(new URL( "https://10.14.65.28:8443/wd/hub"), capabilities);
            System.out.println("MC session was successfully created [Android Device]");
            return wd;

        } catch (Exception e) {
            System.out.println("Test failed.");
            e.printStackTrace();
        }
        return wd;

    }

    public AndroidDriver CreateCapabilitybyAutomationName(String automationName)
    {

        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            //capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("udid", "0715f74de1dc1f3a");
            capabilities.setCapability("deviceName","SM-G920F");
            capabilities.setCapability("appPackage", "com.sample.UICatalog");
            capabilities.setCapability("appActivity", "com.sample.UICatalog.Menu");
            capabilities.setCapability("userName","admin@default.com");
            capabilities.setCapability("password", "password");
            capabilities.setCapability("noReset", true);
            capabilities.setCapability("automationName", automationName);
            //capabilities.setCapability("mcWorkspace", true);

            wd = new AndroidDriver(new URL( "http://10.14.67.94:8080/wd/hub"), capabilities);
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


    }

    @Test
    public void DeviceInfoTest() throws Exception{
        AndroidDriver driver = CreateCapabilitybyAutomationName("UiAutomator2");

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

    @Test
    public void DeviceInfoEspressoTest() throws Exception{
        AndroidDriver driver = CreateCapabilitybyAutomationName("Espresso");

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

    @Test
    public void plus(){
        //获取1,需要将Appium Destop 连上手机获取本机上的id
        AndroidDriver driver = CreateCapability();


        driver.findElementById("com.android.calculator2:id/digit_1").click();
        //获取+
        driver.findElementById("com.android.calculator2:id/op_add").click();
        //获取9
        driver.findElementById("com.android.calculator2:id/digit_9").click();
        //获取=
        driver.findElementById("com.android.calculator2:id/eq").click();
    }





}
