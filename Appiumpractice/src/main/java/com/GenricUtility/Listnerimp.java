package com.GenricUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Generalstore.BaseClass;

public class Listnerimp implements ITestListener {

	

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		String failedTc = result.getMethod().getMethodName();
	TakesScreenshot ts = (TakesScreenshot)BaseClass.sdriver;
	File srcImg = ts.getScreenshotAs(OutputType.FILE);
	File destImg = new File("./Screenshot/"+failedTc+".png");	
	try{
		FileUtils.copyFile(srcImg, destImg);
		
	}catch (IOException e)
	{
		e.printStackTrace();
	
		
	}
			
			
			
			
	}

	

}
