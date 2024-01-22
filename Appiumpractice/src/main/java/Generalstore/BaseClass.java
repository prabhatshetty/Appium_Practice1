package Generalstore;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.GenricUtility.GestureUtil;
import com.driverUtility.DriverUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	public AndroidDriver driver;
	public static AndroidDriver sdriver;
	public GestureUtil gUtil;
	public DriverUtil dUtil;
	public LoginPage lp;
	
	
	
	@BeforeSuite
	public void startServer()
	{
		//here we write start server script
		//service = new appiumservice
		//service.start();
		//
		Reporter.log("server start");
	}
	@BeforeMethod
	public void openApp() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		//Identify specific device
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy S21 5G");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		dc.setCapability(MobileCapabilityType.UDID,"R5CRA1VFJAE");
		
		//To open perticular app
		
		
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		
		URL u = new URL("http://localhost:4723");
		 driver = new AndroidDriver(u,dc);
		 sdriver=driver;
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.findElement(AppiumBy.xpath("//android.widget.TextView[@con
		
		 lp=new LoginPage(driver);
		 dUtil=new DriverUtil(driver);
		 gUtil=new GestureUtil(driver);
		 
		 
		 
		
	}

	@AfterMethod
	public void closeapp()
	
	{
	driver.quit();	
	}
	
	@AfterSuite
	public void stopserver()
	{
		//Here we write to stop the server
	}
}

