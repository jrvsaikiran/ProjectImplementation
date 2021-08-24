package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelPaymentWithOutGst extends GenericWrappers {
	
public HotelPaymentWithOutGst(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	
	public HotelPaymentWithOutGst clickOnAgree() {
		clickByXpath(prop.getProperty("HotelPaymentWithOutGst.xpath.clickOnAgree"));
		return this;
	}
	public HotelOtpField clickOnMakePayment() {
		clickByXpath(prop.getProperty("HotelPaymentWithOutGst.xpath.clickOnMakePayment"));
		return new HotelOtpField(driver,test);
	}
	
	
	
	
	
	
	
	
	
	

}
