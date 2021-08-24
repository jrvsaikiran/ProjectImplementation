package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SwitchHotelWindow1 extends GenericWrappers{
	
	public SwitchHotelWindow1(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	public HotelsBookingPage hotelWindow1() {
		switchToLastWindow();
		return new HotelsBookingPage(driver,test);
	}
	
	
	
	

}
