package Generalstore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GenricUtility.GestureUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	public AndroidDriver driver;
	public GestureUtil gUtil;
	//Declaring the element
	
	@FindBy(id="com.androidsample.generalstore:id/spinnerCountry")
	private WebElement countrydropdown;
	
	@FindBy(xpath="//android.widget.TextView[@text='India']")
	private WebElement countryname;

	@FindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement nametextfield;
	
	@FindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private WebElement letsshopbutton;
	
	//initializing the element
	
	public LoginPage(AndroidDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public WebElement getCountrydropdown() {
		return countrydropdown;
	}

	public WebElement getCountryname() {
		return countryname;
	}

	public WebElement getNametextfield() {
		return nametextfield;
	}

	public WebElement getLetsshopbutton() {
		return letsshopbutton;
	}
	
	//method is used to click
	
	public void Logink(GestureUtil gUtil ,String a, String b) {
		countrydropdown.click();
		gUtil.scroll(a);
		//countryname.click();
		nametextfield.sendKeys(b);
		letsshopbutton.click();
	}
	

	
}
