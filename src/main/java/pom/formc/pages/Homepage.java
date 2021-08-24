package pom.formc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class Homepage extends GenericWrappers {
	
	public Homepage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver; 
		this.test = test;
	}
	
	

	public RegistrationPage clickOnSignUpRegistration(){
		clickByXpath(prop.getProperty("Homepage.clickOnSignUpRegistration.xpath"));
		return new RegistrationPage(driver,test);
	}
	
}
