package Resources;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;


public class AndroidCapability implements AndroidCapabilities{
    // init pram
    AndroidDriver driver;
    String AppiumURL = "http://10.14.57.199:8080/wd/hub";
    String MCURL = "http://10.14.57.199:8080";
    String username = "admin@default.com";
    String password = "password";


    public AndroidDriver CreateUICatalogCapability(String deviceName, String deviceUDID) {

        try {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("udid", deviceUDID);
            capabilities.setCapability("deviceName",deviceName);
            capabilities.setCapability("appPackage", "com.sample.UICatalog");
            capabilities.setCapability("appActivity", "com.sample.UICatalog.Menu");
            capabilities.setCapability("userName",username);
            capabilities.setCapability("password", password);
            capabilities.setCapability("noReset", true);

            driver = new AndroidDriver(new URL( AppiumURL), capabilities);
            System.out.println("MC session was successfully created [Android Device]");
            return driver;

        } catch (Exception e) {
            System.out.println("create android driver failed.");
            e.printStackTrace();
        }
        return driver;

    }

    public AndroidDriver CreateChromeCapability(String deviceName, String deviceUDID) {
        try {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("udid", deviceUDID);
            capabilities.setCapability("deviceName",deviceName);
            capabilities.setCapability("browserName", "chrome");
            capabilities.setCapability("userName",username);
            capabilities.setCapability("password", password);
            capabilities.setCapability("noReset", true);

            driver = new AndroidDriver(new URL( AppiumURL), capabilities);
            System.out.println("MC session was successfully created [Android Device]");
            return driver;

        } catch (Exception e) {
            System.out.println("create android driver failed.");
            e.printStackTrace();
        }
        return driver;
    }

    public AndroidDriver CreateAMBCapability(String deviceName, String deviceUDID) {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("udid", deviceUDID);
            capabilities.setCapability("deviceName",deviceName);
            capabilities.setCapability("appPackage", "com.hpswdemo.advantageinc");
            capabilities.setCapability("appActivity", "com.hpswdemo.advantageinc.activities.MainActivity");
            capabilities.setCapability("userName",username);
            capabilities.setCapability("password", password);
            capabilities.setCapability("noReset", true);

            driver = new AndroidDriver(new URL( AppiumURL), capabilities);
            System.out.println("MC session was successfully created [Android Device]");
            return driver;

        } catch (Exception e) {
            System.out.println("create android driver failed.");
            e.printStackTrace();
        }
        return driver;
    }

    public AndroidDriver CreateCapability(String deviceName, String deviceUDID, String AppPackage, String AppActivity) {
        try {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("udid", deviceUDID);
            capabilities.setCapability("deviceName",deviceName);
            capabilities.setCapability("appPackage", AppPackage);
            capabilities.setCapability("appActivity", AppActivity);
            capabilities.setCapability("userName",username);
            capabilities.setCapability("password", password);
            capabilities.setCapability("noReset", true);

            driver = new AndroidDriver(new URL( AppiumURL), capabilities);
            System.out.println("MC session was successfully created [Android Device]");
            return driver;

        } catch (Exception e) {
            System.out.println("create android driver failed.");
            e.printStackTrace();
        }
        return driver;
    }

    public AndroidDriver CreateCapability(String MCServer, String username, String password, String deviceName, String deviceUDID, String AppPackage, String AppActivity) {
        try {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("udid", deviceUDID);
            capabilities.setCapability("deviceName",deviceName);
            capabilities.setCapability("appPackage", AppPackage);
            capabilities.setCapability("appActivity", AppActivity);
            capabilities.setCapability("userName",username);
            capabilities.setCapability("password", password);
            capabilities.setCapability("noReset", true);

            driver = new AndroidDriver(new URL( MCServer+"/wd/hub"), capabilities);
            System.out.println("MC session was successfully created [Android Device]");
            return driver;

        } catch (Exception e) {
            System.out.println("create android driver failed.");
            e.printStackTrace();
        }
        return driver;
    }

    public AndroidDriver CreateAppiumCapability(String AppiumServer, String deviceName, String deviceUDID, String AppPackage, String AppActivity) {
        try {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("udid", deviceUDID);
            capabilities.setCapability("deviceName",deviceName);
            capabilities.setCapability("appPackage", AppPackage);
            capabilities.setCapability("appActivity", AppActivity);
            capabilities.setCapability("noReset", true);

            driver = new AndroidDriver(new URL( AppiumServer+"/wd/hub"), capabilities);
            System.out.println("MC session was successfully created [Android Device]");
            return driver;

        } catch (Exception e) {
            System.out.println("create android driver failed.");
            e.printStackTrace();
        }
        return driver;
    }


    public AndroidDriver CreateCapabilityByPlatformName (String platformName) {

        try {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", platformName);
            capabilities.setCapability("appPackage", "com.sample.UICatalog");
            capabilities.setCapability("appActivity", "com.sample.UICatalog.Menu");
            capabilities.setCapability("userName",username);
            capabilities.setCapability("password", password);
            capabilities.setCapability("noReset", true);

            driver = new AndroidDriver(new URL( AppiumURL), capabilities);
            System.out.println("MC session was successfully created [Android Device]");
            return driver;

        } catch (Exception e) {
            System.out.println("create android driver failed.");
            e.printStackTrace();
        }
        return driver;


    }

    public AndroidDriver CreateCapabilityByPlatformNameandAutomationName (String platformName, String automationName) {



        return null;
    }

    public DesiredCapabilities CreateCapabilities_Android (String appPackage, String appActivity, String app, String userName, String password,
                                                           String deviceName, String PlatformName, String orientation, String language, String udid, String locale,
                                                           String automationName, int newCommandTimeout, String platformVersion, String browserName,
                                                           boolean autoLaunch, String appWaitActivity, String appWaitPackage, int deviceReadyTimeout,
                                                           String androidCoverage, boolean enablePerformanceLogging, boolean autoWebview, long avdLaunchTimeout,
                                                           long avdReadyTimeout, String manufacturer, String mcJobId, String mcWorkspaceName, String source, String deviceHostingType) {

    DesiredCapabilities capabilities = new DesiredCapabilities();

        if(!(PlatformName == null|| PlatformName.length()== 0)) capabilities.setCapability("PlatformName",PlatformName);
        if(!(appPackage == null|| appPackage.length()== 0)) capabilities.setCapability("appPackage",appPackage);
        if(!(appActivity == null|| appActivity.length()== 0)) capabilities.setCapability("appActivity",appActivity);
        if(!(udid == null|| udid.length()== 0)) capabilities.setCapability("udid",udid);
        if(!(manufacturer == null|| manufacturer.length()== 0)) capabilities.setCapability("manufacturer",manufacturer);
        if(!(deviceName == null|| deviceName.length()== 0)) capabilities.setCapability("deviceName",deviceName);
        if(!(automationName == null|| automationName.length()== 0)) capabilities.setCapability("automationName",automationName);
        newCommandTimeout = 120; capabilities.setCapability("newCommandTimeout", newCommandTimeout);
        capabilities.setCapability("autoLaunch", autoLaunch);
        if (language != null) capabilities.setCapability("language", language);
        if (locale != null) capabilities.setCapability("locale", locale);
        if (orientation != null) capabilities.setCapability("orientation", orientation);
        capabilities.setCapability("autoWebview", autoWebview);

        //server capability
        if(!(userName == null|| userName.length()== 0)) capabilities.setCapability("userName",userName);
        if(!(password == null|| password.length()== 0)) capabilities.setCapability("password",password);
        if(!(platformVersion == null|| platformVersion.length()== 0)) capabilities.setCapability("platformVersion",platformVersion);
        if(!(app == null|| app.length()== 0)) capabilities.setCapability("app",app);
        if(!(browserName == null|| browserName.length()== 0)) capabilities.setCapability("browserName",browserName);
        if(!(mcJobId == null|| mcJobId.length()== 0)) capabilities.setCapability("mcJobId",mcJobId);
        if(!(mcWorkspaceName == null|| mcWorkspaceName.length()== 0)) capabilities.setCapability("mcWorkspaceName",mcWorkspaceName);
        if(!(source == null|| source.length()== 0)) capabilities.setCapability("source",source);
        if(!(deviceHostingType == null|| deviceHostingType.length()== 0)) capabilities.setCapability("deviceHostingType",deviceHostingType);


        //android capability
        if(!(appWaitActivity == null|| appWaitActivity.length()== 0)) capabilities.setCapability("appWaitActivity",appWaitActivity);
        if(!(appWaitPackage == null|| appWaitPackage.length()== 0)) capabilities.setCapability("appWaitPackage",appWaitPackage);
        if(!(androidCoverage == null|| androidCoverage.length()== 0)) capabilities.setCapability("androidCoverage",androidCoverage);
        deviceReadyTimeout =120;   capabilities.setCapability("enablePerformanceLogging", enablePerformanceLogging);
        avdLaunchTimeout = 120000; capabilities.setCapability("avdLaunchTimeout", avdLaunchTimeout);
        avdReadyTimeout = 120000;  capabilities.setCapability("avdReadyTimeout", avdReadyTimeout);








        return capabilities;
    }
}
