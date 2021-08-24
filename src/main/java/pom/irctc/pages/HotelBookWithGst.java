package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelBookWithGst extends GenericWrappers{
	
public HotelBookWithGst(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public HotelBookWithGst selectTitle(String value) {
		selectVisibileTextByXpath(prop.getProperty("HotelBookWithGst.xpath.selectTitle"), value);
		return this;
	}
	public HotelBookWithGst enterFirstName(String data) {
		enterByXpath(prop.getProperty("HotelBookWithGst.xpath.enterFirstName"), data);
		return this;
	}
	public HotelBookWithGst enterLasteName(String data) {
		enterByXpath(prop.getProperty("HotelBookWithGst.xpath.enterLasteName"), data);
		return this;
	}
	public HotelBookWithGst selectCopuntry(String value) {
		selectVisibileTextByXpath(prop.getProperty("HotelBookWithGst.xpath.selectCopuntry"), value);
		return this;
	}
	public HotelBookWithGst selectState(String value) {
		selectVisibileTextByXpath(prop.getProperty("HotelBookWithGst.xpath.selectState"), value);
		return this;
	}	
	public HotelBookWithGst enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("HotelBookWithGst.xpath.enterMobileNumber"), data);
		return this;
	}
	public HotelBookWithGst enterEmailId(String data) {
		enterByXpath(prop.getProperty("HotelBookWithGst.xpath.enterEmailId"), data);
		return this;
	}				
	public HotelBookWithGst selectGstAsYesOrNo(String value) {
		selectVisibileTextByXpath(prop.getProperty("HotelBookWithGst.xpath.selectGstAsYesOrNo"), value);
		return this;
	}
	public HotelBookWithGst enterGstNumber(String data) {
		enterByXpath(prop.getProperty("HotelBookWithGst.xpath.enterGstNumber"), data);
		return this;
	}
	public HotelBookWithGst enterCompanyName(String data) {
		enterByXpath(prop.getProperty("HotelBookWithGst.xpath.enterCompanyName"), data);
		return this;
	}
	public HotelBookWithGst enterCompanyAddress(String data) {
		enterByXpath(prop.getProperty("HotelBookWithGst.xpath.enterCompanyAddress"), data);
		return this;
	}
	public HotelBookWithGst pageDown() {
		pageDownByXpath("//html/body");
		return this;
	}
	
	
	
	public HotelBookWithGst verifyHotelName(String text) {
		verifyTextByXpath(prop.getProperty("HotelBookWithGst.xpath.verifyHotelName"), text);
		return this;
	}
	public HotelBookWithGst verifyHotelPrice(String text) {
		verifyTextByXpath(prop.getProperty("HotelBookWithGst.xpath.verifyHotelPrice"), text);
		return this;
	}
	
	
	
	
	
	
	
	public HotelBookWithGst clickOnContinue() {
		clickByXpath(prop.getProperty("HotelBookWithGst.xpath.clickOnContinue"));
		return  this;
	}
	
	public HotelBookWithGst verifyGstErrorMsgDisplayed(String value) {
		verifyTextByXpath(prop.getProperty("HotelBookWithGst.xpath.verifyGstErrorMsgDisplayed"), "Please Enter Valid GSt number");
		return this;
	}
	

}
