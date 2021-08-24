package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelSecondDisplayed extends GenericWrappers{
	
	
	
public HotelSecondDisplayed(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	
	
	public HotelSecondDisplayed getTextOfHotelName() {
		getTextByXpath(prop.getProperty("HotelSecondDisplayed.xpath.getTextOfHotelName"));
		return this;
	}
	
	

	public HotelSecondDisplayed getTextOfHotelPayCost( ) {
		getTextByXpath(prop.getProperty("HotelSecondDisplayed.xpath.getTextOfHotelPayCost"));
		return this;
	}
	
	
	
	
	public HotelGuestUserLoginPage clickOnContinueToBook() {
		clickByXpath(prop.getProperty("HotelSecondDisplayed.xpath.clickOnContinueToBook"));
		return new HotelGuestUserLoginPage(driver,test);
	}

}
