package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelBookWithOutGst extends GenericWrappers{
	
public HotelBookWithOutGst(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	
	public HotelBookWithOutGst selectTitle(String value) {
		selectVisibileTextByXpath(prop.getProperty("HotelBookWithOutGst.xpath.selectTitle"), value);
		return this;
	}
	public HotelBookWithOutGst enterFirstName(String data) {
		enterByXpath(prop.getProperty("HotelBookWithOutGst.xpath.enterFirstName"), data);
		return this;
	}
	public HotelBookWithOutGst enterLasteName(String data) {
		enterByXpath(prop.getProperty("HotelBookWithOutGst.xpath.enterLasteName"), data);
		return this;
	}
	public HotelBookWithOutGst selectCopuntry(String value) {
		selectVisibileTextByXpath(prop.getProperty("HotelBookWithOutGst.xpath.selectCopuntry"), value);
		return this;
	}
	public HotelBookWithOutGst selectState(String value) {
		selectVisibileTextByXpath(prop.getProperty("HotelBookWithOutGst.xpath.selectState"), value);
		return this;
	}	
	public HotelBookWithOutGst enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("HotelBookWithOutGst.xpath.enterMobileNumber"), data);
		return this;
	}
					
	public HotelBookWithOutGst selectGstAsYesOrNo(String value) {
		selectVisibileTextByXpath(prop.getProperty("HotelBookWithOutGst.xpath.selectGstAsYesOrNo"), value);
		return this;
	}
	
	
	
	
	public HotelBookWithOutGst verifyHotelName(String text) {
		verifyTextByXpath(prop.getProperty("HotelBookWithOutGst.xpath.verifyHotelName"), text);
		return this;
	}
	public HotelBookWithOutGst verifyHotelPrice(String text) {
		verifyTextByXpath(prop.getProperty("HotelBookWithOutGst.xpath.verifyHotelPrice"), text);
		return this;
	}
	
	
	
	
	public HotelPaymentWithOutGst clickOnContinue() {
		clickByXpath(prop.getProperty("HotelBookWithOutGst.xpath.clickOnContinue"));
		return new HotelPaymentWithOutGst(driver,test);
	}
	

}
