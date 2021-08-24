package pom.irctc.pages;

import java.util.Set;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers{
	
	
	
	
	public AccommodationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver; 
		this.test = test;
	}
	
	public SwitchHotelWindow1 clickOnHotelsIcon() {
		clickByXpath(prop.getProperty("AccommodationPage.xpath.clickOnHotelsIcon"));
		return new SwitchHotelWindow1(driver,test);
		
	}
	
	public AccommodationPage mouseOverOnMenuAtTopRightSide() {
		mouseOverByXpath(prop.getProperty("AccommodationPage.xpath.mouseOverOnMenuAtTopRightSide"));
		return this;
	}
	
	public AccommodationPage clickOverOnMenuAtTopRightSide() {
		clickByXpath(prop.getProperty("AccommodationPage.xpath.clickOverOnMenuAtTopRightSide"));
		return this;
	}
	
	
	
	
	
	
	public CharterMainPage clickOnCharter() {
		clickByXpath(prop.getProperty("AccommodationPage.xpath.clickOnCharter"));
		return new CharterMainPage(driver,test);
	}
	public SwitchWindow2 clickOnBookYourcoachOrTrain() {
		clickByXpath(prop.getProperty("AccommodationPage.xpath.clickOnBookYourcoachOrTrain"));
		return new SwitchWindow2(driver,test);
	}


	
	
	




	
	
	
	
}
