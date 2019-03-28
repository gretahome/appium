package mf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.File;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class iOS_test01 {

	 private AppiumDriver<IOSElement> driver;
	 private WebElement row;
	
	@Before
	public void setUp() throws Exception{
 
		
//		File app = new File("/Users/xiao-long.liu/apps/iOS/UICatalog_NI.ipa ");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
        
		capabilities.setCapability("deviceId", "15baa86887884dd4795b77a8299fb62aed164d25");
		capabilities.setCapability("userName", "admin@default.com");
		capabilities.setCapability("password", "111@Hpe");
		capabilities.setCapability("platformName","iOS");  
        capabilities.setCapability("platformVersion","11.2.1");  
        capabilities.setCapability("deviceName", "iPhoneX");
        capabilities.setCapability("appPackage", "com.apple.mobilesafari");
        capabilities.setCapability("noReset", true);

//        capabilities.setCapability("appPackage", "com.hp.testapp.UICatalog-NI");  
//        capabilities.setCapability("sessionOverride", true);    //æ¯�æ¬¡å�¯åŠ¨æ—¶è¦†ç›–sessionï¼Œå�¦åˆ™ç¬¬äºŒæ¬¡å�Žè¿�è¡Œä¼šæŠ¥é”™ä¸�èƒ½æ–°å»ºsession  
        
        driver = new IOSDriver(new URL("localhost:8080/wd/hub"), capabilities);
		
	}
	
	@After 
	public void tearDown() throws Exception{
		driver.quit();
	}
	
	private void openMenuPosition(int index) {
		MobileElement table = (MobileElement)driver.findElementByClassName("UIATableView");
		 row = table.findElementsByClassName("UIATableCell").get(index);
		 row.click();
	}
	
	 private Point getCenter(WebElement element) {
	      Point upperLeft = element.getLocation();
	      Dimension dimensions = element.getSize();
	      return new Point(upperLeft.getX() + dimensions.getWidth()/2, upperLeft.getY() + dimensions.getHeight()/2);
	 }

	 
	 @Test
	 public void testFindElement() throws Exception {
		 IOSElement table = driver.findElementByName("UITableView");
		 assertNotNull(table);
		 
		 List<MobileElement> rows = table.findElementsByName("UIATableCell");
		 assertEquals(18, rows.size());
		 assertEquals("Action Sheets", rows.get(0).getAttribute("name"));
		 
		 WebElement nav_bar = null;
		 try {
			 nav_bar = table.findElementByClassName("UIANavigationBar");
			 
		 }catch (NoSuchElementException e) {
			 
		 }
		 
		 assertNull(nav_bar);
		 
		 driver.getPageSource();
		 nav_bar = driver.findElementByClassName("UINavigationBar");
		 assertNotNull(nav_bar);
		 
	 }
	 
	 @Test
	 public void test_location()  {
		 row = driver.findElementsByClassName("UIATableCell").get(2);
		 assertEquals(0, row.getLocation().x);
		 assertEquals(152, row.getLocation().y);
	 }
	 
	
	 @Test 
	 public void testScreenshot() {
		 
		 String screenshot = driver.getScreenshotAs(OutputType.BASE64);
		 
		 System.out.println(screenshot);
		 
//		 WebDriver augmentedDriver = new Augmenter().augment(driver);
//		 String screenshot = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.BASE64);
//		 assertNotNull(screenshot);
		 
//		 File file = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
//	     assertNotNull(file);
		 
	 }
	 
	
}
