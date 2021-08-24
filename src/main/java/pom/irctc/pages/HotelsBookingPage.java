package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelsBookingPage extends GenericWrappers {
	
	
	
public HotelsBookingPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public HotelsBookingPage enterCityOrHotelName(String data) {
		enterByXpath(prop.getProperty("HotelsBookingPage.xpath.enterCityOrHotelName"), data);
		return this;
	}
	public HotelsBookingPage clickOnCity() {
		clickByXpath(prop.getProperty("HotelsBookingPage.xpath.clickOnCity"));
		return this;
	}
	public HotelsBookingPage clickOnCheckInDateBar() {
		clickByXpath(prop.getProperty("HotelsBookingPage.xpath.clickOnCheckInDateBar"));
		return this;
	}
	public HotelsBookingPage clickOnDateHeadder() {
		clickByXpath(prop.getProperty("HotelsBookingPage.xpath.clickOnDateHeadder"));
		return this;
	}
	public HotelsBookingPage clickOnYear(String year) {
		clickByXpath(prop.getProperty("HotelsBookingPage.xpath.clickOnYear"),year);
		return this;
	}
	public HotelsBookingPage clickOnMonth(String month) {
		clickByXpath(prop.getProperty("HotelsBookingPage.xpath.clickOnMonth"),month);
		return this;
	}
	public HotelsBookingPage clickOnDate(String date) {
		clickByXpath(prop.getProperty("HotelsBookingPage.xpath.clickOnDate"),date);
		return this;
	}
	
	
	public HotelsBookingPage clickOnCheckOutDateBar() {
		clickByXpath(prop.getProperty("HotelsBookingPage.xpath.clickOnCheckOutDateBar"));
		return this;
	}
	public HotelsBookingPage clickOnCheckOutDateHeadder() {
		clickByXpath(prop.getProperty("HotelsBookingPage.xpath.clickOnCheckOutDateHeadder"));
		return this;
	}
	public HotelsBookingPage clickOnCheckOutYear(String year) {
		clickByXpath(prop.getProperty("HotelsBookingPage.xpath.clickOnCheckOutYear"),year);
		return this;
	}
	public HotelsBookingPage clickOnCheckOutMonth(String month) {
		clickByXpath(prop.getProperty("HotelsBookingPage.xpath.clickOnCheckOutMonth"),month);
		return this;
	}
	public HotelsBookingPage clickOnCheckOutDate(String date) {
		clickByXpath(prop.getProperty("HotelsBookingPage.xpath.clickOnCheckOutDate"),date);
		return this;
	}
	
	
	
	public HotelsBookingPage clickOnRoomsGuestBar() {
		clickByXpath(prop.getProperty("HotelsBookingPage.xpath.clickOnRoomsGuestBar"));
		return this;
	}
	public HotelsBookingPage clickOnAdultBar() {
		clickByXpath(prop.getProperty("HotelsBookingPage.xpath.clickOnAdultBar"));
		return this;
	}
	
	
	public HotelsBookingPage selectOnAdultsNumber(int value) {
		selectValueByXpath(prop.getProperty("HotelsBookingPage.xpath.selectOnAdultsNumber"), value);
		
		return this;
	}
	public HotelsBookingPage clickOnDone() {
		clickByXpath(prop.getProperty("HotelsBookingPage.xpath.clickOnDone"));
		return this;
	}
	public HotelDisplayPage clickOnFindHotel() {
		clickByXpath(prop.getProperty("HotelsBookingPage.xpath.clickOnFindHotel"));
		return new HotelDisplayPage(driver,test);
	}
	
	
	
	
	
	
}
