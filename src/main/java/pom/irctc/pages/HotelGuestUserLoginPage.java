package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelGuestUserLoginPage extends GenericWrappers {
	
	
	
	
public HotelGuestUserLoginPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public HotelGuestUserLoginPage2 clickOnGuestUserLogin() {
		clickByXpath(prop.getProperty("HotelGuestUserLoginPage.xpath.clickOnGuestUserLogin"));
		return new HotelGuestUserLoginPage2(driver,test);
	}
	
	
	
	

}
