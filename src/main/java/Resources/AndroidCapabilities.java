package Resources;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public interface AndroidCapabilities {

    public AndroidDriver CreateUICatalogCapability(String deviceName,String deviceUDID);
    public AndroidDriver CreateChromeCapability(String deviceName,String deviceUDID);
    public AndroidDriver CreateAMBCapability(String deviceName,String deviceUDID);
    public AndroidDriver CreateCapability(String deviceName,String deviceUDID,String AppPackage,String AppActivity);
    public AndroidDriver CreateCapability(String AppiumServer,String username,String password,String deviceName,String deviceUDID,String AppPackage,String AppActivity);
    public AndroidDriver CreateAppiumCapability(String AppiumServer,String deviceName,String deviceUDID,String AppPackage,String AppActivity);
    public AndroidDriver CreateCapabilityByPlatformName(String platformName);
    public AndroidDriver CreateCapabilityByPlatformNameandAutomationName(String platformName,String automationName);
    public DesiredCapabilities CreateCapabilities_Android(String appPackage , String appActivity, String app , String userName , String password , String deviceName ,
                                                          String PlatformName, String orientation , String language, String udid , String locale ,
                                                          String automationName, int newCommandTimeout, String platformVersion , String browserName,
                                                          boolean autoLaunch , String appWaitActivity , String appWaitPackage, int deviceReadyTimeout,
                                                          String androidCoverage , boolean enablePerformanceLogging , boolean autoWebview, long avdLaunchTimeout ,
                                                          long avdReadyTimeout , String manufacturer, String mcJobId, String mcWorkspaceName, String source,
                                                          String deviceHostingType);


}
