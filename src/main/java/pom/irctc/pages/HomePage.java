package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver; 
		this.test = test;
	}
	
	

	
	public RegistrationPage clickOnRegister() {
		clickByXpath(prop.getProperty("HomePage.xpath.clickOnRegister"));
		return new RegistrationPage(driver,test);
	}
	
	
	public HomePage mouseOverOnHolidays() {
		mouseOverByXpath(prop.getProperty("HomePage.xpath.mouseOverOnHolidays"));
		return this;
	}
	
	
	
	public HomePage mouseOverOnStays() {
		mouseOverByXpath(prop.getProperty("HomePage.xpath.mouseOverOnStays"));
		return this;
	}
	
	public SwitchWindow clickOnLounge() {
		clickByXpath(prop.getProperty("HomePage.xpath.clickOnLounge"));
		return new SwitchWindow(driver, test);
	}
	
}
