package com.driverUtility;

import org.openqa.selenium.ScreenOrientation;

import io.appium.java_client.android.AndroidDriver;

public class DriverUtil {
	
	AndroidDriver driver;
	public DriverUtil(AndroidDriver driver)
	{
		this.driver=driver;
	}
	
	public void rotateToLandscape()
	{
		ScreenOrientation sc = driver.getOrientation();
		driver.rotate(sc.LANDSCAPE);
		
	}
	
	
	
	

}
