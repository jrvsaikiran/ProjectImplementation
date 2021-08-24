package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SwitchHotelWindow2  extends GenericWrappers{
	
	
	public SwitchHotelWindow2(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	
	public HotelSecondDisplayed hotelWindow2(){
		switchToLastWindow();
		return new HotelSecondDisplayed (driver, test);
	}
	
	
	

}
