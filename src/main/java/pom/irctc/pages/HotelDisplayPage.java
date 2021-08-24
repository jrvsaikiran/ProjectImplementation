package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelDisplayPage extends GenericWrappers{
	
	
	
public HotelDisplayPage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
	}
	
	
	
	
	
	public SwitchHotelWindow2 clickOnFirstDisplayedHotel() {
		clickByXpath(prop.getProperty("HotelDisplayPage.xpath.clickOnFirstDisplayedHotel"));
		return new SwitchHotelWindow2(driver,test);
	}

}
