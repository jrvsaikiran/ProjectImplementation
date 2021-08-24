package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SwitchWindow extends GenericWrappers{
	
	
	public SwitchWindow(RemoteWebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		this.test= test;
		
		
	}

	public AccommodationPage windowChange1() {
		
		
		switchToLastWindow();
		return new AccommodationPage(driver,test);
	}
	
	
	
	
	
	
	

}
