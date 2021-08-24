package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelGuestUserLoginPage2 extends GenericWrappers{
	
	
	
	
public HotelGuestUserLoginPage2(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	
	public HotelGuestUserLoginPage2 enterEmail(String data) {
		enterByXpath(prop.getProperty("HotelGuestUserLoginPage2.xpath.enterEmail"), data);
		return this;
	}
	public HotelGuestUserLoginPage2 enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("HotelGuestUserLoginPage2.xpath.enterMobileNumber"), data);
		return this;
	}
	
	public HotelBookWithOutGst clickOnLogInButtonForNoGst() {
		clickByXpath(prop.getProperty("HotelGuestUserLoginPage2.xpath.clickOnLogInButtonForNoGst"));
		return new HotelBookWithOutGst(driver,test);
	}
	public HotelBookWithGst clickOnLogInButtonForGst() {
		clickByXpath(prop.getProperty("HotelGuestUserLoginPage2.xpath.clickOnLogInButtonForGst"));
		return new HotelBookWithGst(driver,test);
	}
	
	
}
