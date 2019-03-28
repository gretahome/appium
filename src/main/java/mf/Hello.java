package mf;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Hello {
	public static final String MC_SERVER = "http://10.14.57.42:8080";

	public static final String MC_SERVER_USER = "admin@default.com";

	public static final String MC_SERVER_PASSWORD = "password";

	public static void main(String args[]) {

		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("udid", "Y2J7N17725001764");
			capabilities.setCapability("deviceName","123");
			capabilities.setCapability("appPackage", "com.sample.UICatalog");
			capabilities.setCapability("appActivity", "com.sample.UICatalog.Menu");
			capabilities.setCapability("userName","admin@default.com");
			capabilities.setCapability("password", "password");
			// capabilities.setCapability("noReset", true);

			AndroidDriver wd = new AndroidDriver(new URL( "http://localhost:4723/wd/hub"), capabilities);
			System.out.println("MC session was successfully created [Android Device]");
			wd.findElementByXPath("//*[contains(@text, 'TimeActivity')]");
			wd.quit();
		} catch (Exception e) {
			System.out.println("Test failed.");
			e.printStackTrace();
		}


	}
}
