package Resources;

import io.appium.java_client.ios.IOSDriver;

public interface IOSCapabilities {

    public IOSDriver CreateUICatalogCapability(String deviceName,String deviceUDID);
    public IOSDriver CreateChromeCapability(String deviceName,String deviceUDID);
    public IOSDriver CreateAMBCapability(String deviceName,String deviceUDID);
    public IOSDriver CreateCapability(String deviceName,String deviceUDID,String BundleID);
    public IOSDriver CreateCapability(String AppiumServer,String username,String password,String deviceName,String deviceUDID,String BundleID);
    public IOSDriver CreateAppiumCapability(String AppiumServer,String deviceName,String deviceUDID,String BundleID);
}
