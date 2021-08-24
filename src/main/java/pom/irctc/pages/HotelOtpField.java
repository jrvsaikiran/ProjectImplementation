package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelOtpField extends GenericWrappers {
public HotelOtpField(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	
	
	
	
	//down one is  right xpath
	public HotelOtpField verifyTextContainOtp( String test) {
		verifyTextContainsByXpath(prop.getProperty("HotelOtpField.xpath.verifyTextContainOtp"), test);
		return this;
	}
	
}
