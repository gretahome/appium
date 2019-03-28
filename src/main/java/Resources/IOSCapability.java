package Resources;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class IOSCapability implements IOSCapabilities{

    public IOSDriver driver;
    String AppiumURL = "http://10.14.57.42:8080/wd/hub";
    String MCURL = "http://10.14.57.42:8080";
    String username = "admin@default.com";
    String password = "password";

    public IOSDriver CreateUICatalogCapability(String deviceName, String deviceUDID) {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("userName", username);
            capabilities.setCapability("password", password);
            capabilities.setCapability("udid", deviceUDID);
            capabilities.setCapability("bundleId", "com.hp.testapp.UICatalog-NI");
            capabilities.setCapability("deviceName", deviceName);
            capabilities.setCapability("automationName", "XCUITest");

            driver = new IOSDriver(new URL(AppiumURL), capabilities);

            return driver;
        }
        catch (Exception e) {
            System.out.println("create IOS driver failed.");
            e.printStackTrace();
        }
        return driver;
    }

    public IOSDriver CreateChromeCapability(String deviceName, String deviceUDID) {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("userName", username);
            capabilities.setCapability("password", password);
            capabilities.setCapability("udid", deviceUDID);
            capabilities.setCapability("bundleId", "com.hp.testapp.UICatalog-NI");
            capabilities.setCapability("deviceName", deviceName);
            capabilities.setCapability("automationName", "XCUITest");

            driver = new IOSDriver(new URL(AppiumURL), capabilities);

            return driver;
        }
        catch (Exception e) {
            System.out.println("create IOS driver failed.");
            e.printStackTrace();
        }
        return driver;
    }

    public IOSDriver CreateAMBCapability(String deviceName, String deviceUDID) {
        try {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("userName", username);
            capabilities.setCapability("password", password);
            capabilities.setCapability("udid", deviceUDID);
            capabilities.setCapability("bundleId", "com.hpe.advantage");
            capabilities.setCapability("deviceName", deviceName);
            capabilities.setCapability("automationName", "XCUITest");

            driver = new IOSDriver(new URL(AppiumURL), capabilities);

            return driver;
        }
        catch (Exception e) {
            System.out.println("create IOS driver failed.");
            e.printStackTrace();
        }
        return driver;
    }

    public IOSDriver CreateCapability(String deviceName, String deviceUDID, String BundleID) {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("userName", username);
            capabilities.setCapability("password", password);
            capabilities.setCapability("udid", deviceUDID);
            capabilities.setCapability("bundleId", BundleID);
            capabilities.setCapability("deviceName", deviceName);
            capabilities.setCapability("automationName", "XCUITest");

            driver = new IOSDriver(new URL(AppiumURL), capabilities);

            return driver;
        }
        catch (Exception e) {
            System.out.println("create IOS driver failed.");
            e.printStackTrace();
        }
        return driver;
    }

    public IOSDriver CreateCapability(String AppiumServer, String username, String password, String deviceName, String deviceUDID, String BundleID) {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("userName", username);
            capabilities.setCapability("password", password);
            capabilities.setCapability("udid", deviceUDID);
            capabilities.setCapability("bundleId", BundleID);
            capabilities.setCapability("deviceName", deviceName);
            capabilities.setCapability("automationName", "XCUITest");

            driver = new IOSDriver(new URL(AppiumServer+"/wd/hub"), capabilities);

            return driver;
        }
        catch (Exception e) {
            System.out.println("create IOS driver failed.");
            e.printStackTrace();
        }
        return driver;
    }

    public IOSDriver CreateAppiumCapability(String AppiumServer, String deviceName, String deviceUDID, String BundleID) {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("userName", username);
            capabilities.setCapability("password", password);
            capabilities.setCapability("udid", deviceUDID);
            capabilities.setCapability("bundleId", BundleID);
            capabilities.setCapability("deviceName", deviceName);
            capabilities.setCapability("automationName", "XCUITest");

            driver = new IOSDriver(new URL(AppiumServer+"/wd/hub"), capabilities);

            return driver;
        }
        catch (Exception e) {
            System.out.println("create IOS driver failed.");
            e.printStackTrace();
        }
        return driver;
    }
}
