package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SwitchWindow2  extends GenericWrappers{


	public SwitchWindow2(RemoteWebDriver driver, ExtentTest test) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		this.test= test;
		
		
	}

	public HomePageOfFTR windowChange2() {
		
		
		switchToLastWindow();
		return new HomePageOfFTR(driver,test);
	}
	
	
	
	
	
}
