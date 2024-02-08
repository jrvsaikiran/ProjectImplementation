package testcases;


import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TC004 extends GenericWrappers{
	
	@Test
	public void phpTravels() {
	invokeApp("chrome", "https://www.phptravels.org/register.php");	
	enterById("inputFirstName", "saikiran");	
	enterById("inputLastName", "jakkula");	
	enterById("inputEmail", "kiran@gmail.com");	
	clickByXpath("//*[@id=\"containerNewUserSignup\"]/div[2]/div[4]/div/div/div/div/div[2]");
	clickByXpath("//*[@id=\"containerNewUserSignup\"]/div[2]/div[4]/div/div/div/ul/li[102]");	
	enterById("inputPhone", "8985891589");	
	enterById("inputCompanyName", "saptextails");	
	enterById("inputAddress1", "parkstreet");	
	enterById("inputAddress2", "sattenspalli");	
	enterById("inputCity", "guntur");
	selectVisibileTextById("inputCountry", "India");
	waitTime(3000);
	selectIndexById("stateselect", 2);
	enterById("inputPostcode", "522333");	
	selectIndexById("customfield1", 2);	
	enterById("customfield2", "8985891589");	
	enterById("inputNewPassword1", "Ss@8985891579");	
	enterById("inputNewPassword2", "Ss@8985891579");		
		
	}
	
	

}
