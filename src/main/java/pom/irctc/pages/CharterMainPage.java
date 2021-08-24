package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class CharterMainPage  extends GenericWrappers{
	
	
	public CharterMainPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver; 
		this.test = test;
	}
	
	
	
	
	
	

	public CharterMainPage clickOntoprightArrowToClose() {
		clickByXpath(prop.getProperty("CharterMainPage.xpath.clickOntoprightArrowToClose"));
		return this;
	}
	
	
	
	public SaloonMandatoryCheck clickOnEnquiryForm() {
		clickByXpath(prop.getProperty("CharterMainPage.xpath.clickOnEnquiryForm"));
		return new SaloonMandatoryCheck(driver,test);
	}
}
