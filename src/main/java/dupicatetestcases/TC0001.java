package dupicatetestcases;



import org.testng.annotations.Test;

import utils.DP001;
import wrappers.GenericWrappers;

public class TC0001 extends GenericWrappers {
	
	@Test(dataProvider="fetchData",dataProviderClass=DP001.class)
	public void facebook(String firstName, String lastName, String email, String confEmail, String password,
			String date, String month, String year) {
		
		invokeApp("chrome", "http://www.facebook.com");	
		clickByLink("English (UK)");
		clickByLink("Create New Account");
		waitTime(3000);
		enterByName("firstname", firstName);
		enterByName("lastname", lastName);
		enterByName("reg_email__", email);
		enterByName("reg_email_confirmation__", confEmail);
		enterById("password_step_input", password);
		waitTime(3000);
		selectVisibileTextById("date", date);
		waitTime(3000);
		selectVisibileTextById("month", month);
		selectVisibileTextById("year", year);
		clickByXpath("(//*[@name='sex'])[2]");
		
		
		
		
		
	}
	
	
}
