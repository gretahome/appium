package Android;

import Resources.AndroidCapability;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class DeviceFiltering {
    String appPackage = "com.sample.UICatalog";
    String appActivity = "com.sample.UICatalog.Menu";
    String username = "admin@default.com";
    String password = "password";
    String serverURL = "http://10.14.67.138:8080";
    AndroidDriver driver = null;

    @Test(enabled = true)
    public void testdevicefilter(){
        List<DesiredCapabilities> list = createAndroidCapabilities();

            for(int i = 0;i < list.size();i++) {
                try {
                driver = new AndroidDriver(new URL(serverURL+"/wd/hub"), list.get(i));
                System.out.println("MC session was successfully created [Android Device]");
                DeviceInfoTest(driver);
            }
                catch (Exception e){
                    System.out.println("Test failed.");
                    e.printStackTrace();
                }
            }

    }

    public void DeviceInfoTest(AndroidDriver driver) throws Exception{
        System.out.println("++++++++++++++++++++");
        WebDriverWait wait = new WebDriverWait(driver,10);


        System.out.println(driver.getSupportedPerformanceDataTypes());
        System.out.println("++++++++++++++++++++");
        System.out.println(driver.getPerformanceData("com.sample.UICatalog", "memoryinfo", 10));
        System.out.println(driver.getPerformanceData("com.sample.UICatalog", "batteryinfo", 10));
        System.out.println(driver.getPerformanceData("com.sample.UICatalog", "networkinfo", 10));
        Thread.sleep(3000);

    }

    private List<DesiredCapabilities> createAndroidCapabilities () {

        List<DesiredCapabilities> list = new ArrayList<DesiredCapabilities>();

        //platformname
        DesiredCapabilities capabilities = new AndroidCapability().CreateCapabilities_Android(appPackage, appActivity, null, username, password, null, "Android",
                null, null, null, null, null, 0, null, null, true, null, null, 120, null, false, false, 120, 120, null, null, null,
                null, null);
        list.add(capabilities);

        //devicename
         capabilities = new AndroidCapability().CreateCapabilities_Android(appPackage, appActivity, null, username, password, "LGE LG-H870", null,
                null, null, null, null, null, 0, null, null, true, null, null, 120, null, false, false, 120, 120, null, null, null,
                null, null);
        list.add(capabilities);

        //deviceid
        capabilities = new AndroidCapability().CreateCapabilities_Android(appPackage, appActivity, null, username, password, null, null,
                null, null, "LGD855ad102097", null, null, 0, null, null, true, null, null, 120, null, false, false, 120, 120, null, null, null,
                null, null);
        list.add(capabilities);

        //platformversion
        capabilities = new AndroidCapability().CreateCapabilities_Android(appPackage, appActivity, null, username, password, null, null,
                null, null, null, null, null, 0, "7.0", null, true, null, null, 120, null, false, false, 120, 120, null, null, null,
                null, null);
        list.add(capabilities);

        //platformversion > 5
        capabilities = new AndroidCapability().CreateCapabilities_Android(appPackage, appActivity, null, username, password, null, null,
                null, null, null, null, "UIAutomator2", 0, ">8.0", null, true, null, null, 120, null, false, false, 120, 120, null, null, null,
                null, null);
        list.add(capabilities);

        //devicename + deviceid
        capabilities = new AndroidCapability().CreateCapabilities_Android(appPackage, appActivity, null, username, password, "LGE LG-H870", null,
                null, null, "LGH8702e4953f8", null, null, 0, null, null, true, null, null, 120, null, false, false, 120, 120, null, null, null,
                null, null);
        list.add(capabilities);

        //devicename+ platformversion
        capabilities = new AndroidCapability().CreateCapabilities_Android(appPackage, appActivity, null, username, password, "LGE LG-D855", null,
                null, null, null, null, null, 0, "5.0", null, true, null, null, 120, null, false, false, 120, 120, null, null, null,
                null, null);
        list.add(capabilities);

        //name + udid + version
        capabilities = new AndroidCapability().CreateCapabilities_Android(appPackage, appActivity, null, username, password, "LGE LG-D855", null,
                null, null, "LGD855ad102097", null, null, 0, "5.0", null, true, null, null, 120, null, false, false, 120, 120, null, null, null,
                null, null);
        list.add(capabilities);


        return list;

    }
}