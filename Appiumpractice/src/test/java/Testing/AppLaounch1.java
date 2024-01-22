package Testing;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generalstore.BaseClass;
import Generalstore.LoginPage;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
@Listeners(com.GenricUtility.Listnerimp.class)
public class AppLaounch1 extends BaseClass {

	@Test
	public void launch() throws Throwable {
		
		
			
			//LoginPage login = new LoginPage(driver);
			 
		lp.Logink(gUtil,"India", "Prabhat");
			 
			 
			// login.getCountrydropdown().click()
			 
			 //scroll unti the product
			// driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Nike SFB Jungle\"));"));
	}
			
}
