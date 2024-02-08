package dupicatetestcases;


import org.testng.annotations.Test;

import utils.DP004;
import wrappers.GenericWrappers;

public class TC004 extends GenericWrappers{
	
	@Test(dataProvider = "fetchData", dataProviderClass = DP004.class)
	
	public void phpTravels(String inputFirstName, String inputLastName, String inputEmail,
			String inputPhone, String inputCompanyName, String inputAddress1,
			String inputAddress2, String inputCity, String inputCountry,
			String stateselect, String inputPostcode, String customfield1,
			String customfield2,String inputNewPassword1,String inputNewPassword2) {
		int custom = Integer.parseInt(customfield1);
		
	invokeApp("chrome", "https://www.phptravels.org/register.php");	
	enterById("inputFirstName", inputFirstName);	
	enterById("inputLastName", inputLastName);	
	enterById("inputEmail", inputEmail);	
	clickByXpath("//*[@id=\"containerNewUserSignup\"]/div[2]/div[4]/div/div/div/div/div[2]");
	clickByXpath("//*[@id=\"containerNewUserSignup\"]/div[2]/div[4]/div/div/div/ul/li[102]");	
	enterById("inputPhone", inputPhone);	
	enterById("inputCompanyName", inputCompanyName);	
	enterById("inputAddress1", inputAddress1);	
	enterById("inputAddress2", inputAddress2);	
	enterById("inputCity", inputCity);
	selectVisibileTextById("inputCountry", "India");
	waitTime(3000);
	selectIndexById("stateselect", 2);
	enterById("inputPostcode", inputPostcode);	
	selectIndexById("customfield1", custom);	
	enterById("customfield2", customfield2);	
	enterById("inputNewPassword1", inputNewPassword1);	
	enterById("inputNewPassword2", inputNewPassword2);		
		
	}
	
	

}
