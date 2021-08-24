package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.TestDataProvider;

public class ProjectWrappers extends GenericWrappers {
	
	public String browserName;
	public String appName;
	public String sheetName;
	
	@BeforeSuite
	public void beforeSuite() {
		startReport();
	}
	@BeforeTest
	public void  beforeTest() {
		loadObjects();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		startTest(testCaseName, testCaseDescription);
		
		//invokeApp(browserName, "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
		
		switch (appName) {
		case "facebook":
			invokeApp(browserName, "https://www.facebook.com/");
			break;
		case "irctc":
			invokeApp(browserName, "http://www.irctc.co.in");
			break;
		case "formc":
			invokeApp(browserName, "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
			break;	
		case "panindia":
			invokeApp(browserName, "https://panind.com/india/new_pan/#");
			break;
		case "phptravels":
			invokeApp(browserName, "https://www.phptravels.org/register.php");
			break;	
			
		default:
			System.err.println("Invalid Application");
			break;
		}
		
		
	}
	@AfterMethod
	public void afterMethod() {
		closeAllBrowsers();
	}
	@AfterClass
	public void afterClass() {
		endTest();
	}
	@AfterTest
	public void afterTest() {
		//reserved
		unloadObject();
		
	}
	@AfterSuite
	public void afterSuite() {
		endReport();
	}
	
	
	@DataProvider(name="fetchData")
	public String[][] DP (){
		
		return TestDataProvider.getData(sheetName);
	}
	
	

}
