package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePageOfFTR extends GenericWrappers{
	
	
	public HomePageOfFTR(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver; 
		this.test = test;
	}
	
	public RegistrationOfFTR clickOnNewUserOrSignUp() {
		clickByXpath(prop.getProperty("HomePageOfFTR.xpath.clickOnNewUserOrSignUp"));
		return new RegistrationOfFTR(driver,test);
	}

	
}
