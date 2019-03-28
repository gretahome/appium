package mf;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;

import java.net.URL;

import static org.junit.Assert.*;

public class SafariTest {
	 private WebDriver driver;

	    /**
	     * Instantiates the {@link #driver} instance by using DesiredCapabilities which specify the
	     * 'iPhone Simulator' device and 'safari' app.
	     * @throws Exception
	     */
	 static String HOST_URL = "http://localhost:8080/wd/hub";
	 static String USERNAME = "admin@default.com";
	 static String PASSWORD = "password";
	    @Before
	    public void setUp() throws Exception {
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("deviceId", "15baa86887884dd4795b77a8299fb62aed164d25");
//			capabilities.setCapability("udid", "15baa86887884dd4795b77a8299fb62aed164d25");
			capabilities.setCapability("userName", "admin@default.com");
			capabilities.setCapability("password", "111@Hpe");
			capabilities.setCapability("platformName","iOS");  
	        capabilities.setCapability("platformVersion","11.2.1");  
	        capabilities.setCapability("deviceName", "iPhoneX");
	        capabilities.setCapability("browserName", "safari");
//	        capabilities.setCapability("appPackage", "com.apple.mobilesafari");

	        capabilities.setCapability("noReset", true);
	        driver = new IOSDriver(new URL(HOST_URL),capabilities);
	        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
 
	    }

	    /**
	     * Navigates to http://saucelabs.com/test/guinea-pig and interacts with the browser.
	     *
	     * @throws Exception
	     */
	    @Test
	    public void runTest() throws Exception {
	        driver.get("https://www.baidu.com");
	        Thread.sleep(1000);
//	        WebElement idElement = driver.findElement(By.id("i_am_an_id"));
//	        assertNotNull(idElement);
//	        assertEquals("I am a div", idElement.getText());
//	        WebElement commentElement = driver.findElement(By.id("comments"));
//	        assertNotNull(commentElement);
//	        commentElement.sendKeys("This is an awesome comment");
//	        WebElement submitElement = driver.findElement(By.id("submit"));
//	        assertNotNull(submitElement);
//	        submitElement.click();
//	        Thread.sleep(7000);
//	        WebElement yourCommentsElement = driver.findElement(By.id("your_comments"));
//	        assertNotNull(yourCommentsElement);
//	        assertTrue(driver.findElement(By.id("your_comments")).getText().contains("This is an awesome comment"));

	      System.out.println(driver.getCurrentUrl());
	    }

	    /**
	     * Closes the {@link #driver} instance.
	     *
	     * @throws Exception
	     */
	    @After
	    public void tearDown() throws Exception {
	        driver.quit();
	    }
}
