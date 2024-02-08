package testcases;



import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TC005 extends GenericWrappers {

	@Test
	public void fteRailway() {
	invokeApp("chrome","https://www.ftr.irctc.co.in/ftr/");	
	clickByXpath("//*[@id=\"planner\"]/table/tbody/tr[4]/td[2]/div/a[2]");	
	enterById("userId","Ss_8985saikiran");	
	enterById("password", "Ss@8985891589");	
	enterById("cnfPassword", "Ss@8985891589");	
	selectIndexById("secQstn", 2);	
	enterById("secAnswer", "jrv");	
	clickByXpath("//*[@id=\"dateOfBirth\"]");	
	clickByXpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[6]/a");	
	clickById("gender0");	
	clickById("maritalStatus1");	
	enterById("email", "saikiranjrv@gmail.com");	
	selectIndexById("occupation", 5);	
	enterById("fname", "jrv");	
	enterById("mname", "sai");	
	enterById("lname", "kiran");		
	selectIndexById("natinality", 1);	
	enterById("flatNo", "102");	
	enterById("street", "nehru");	
	enterById("area", "sattenapalli");	
	selectIndexById("country", 1);
	pageDownByXpath("//html/body");
	enterById("mobile", "8985891589");	
	enterById("pincode", "522403");		
	waitTime(3000);	
	waitTime(5000);		
	waitTime(5000);
	clickById("postOffice");
	selectVisibileTextById("postOffice", "Sattenapalle H.O");	
	waitTime(5000);
	//selectIndexByXpath("//*[@id=\"postOffice\"]", 2);
	pageDownByXpath("//html/body");	
	clickByXpath("//*[@id=\"sameAddresses1\"]");
	//clickByName("sameAddresses");
	enterById("flatNoOffice", "flat 222");	
	enterById("streetOffice", "my place");	
	enterById("areaOffice", "baba street");	
	selectIndexById("countryOffice", 1);	
	enterById("mobileOffice", "8985891589");
	enterById("pincodeOffice", "522403");		
	//selectIndexById("cityOffice", 1);	
	waitTime(3000);
	//selectIndexById("stateOffice", 1);	
	waitTime(3000);
	clickById("postOfficeOffice");
	waitTime(5000);
	selectVisibileTextById("postOfficeOffice", "Sattenapalle H.O");	
	//selectIndexByXpath("//*[@id=\"postOfficeOffice\"]", 1);		
	pageDownByXpath("//html/body");	
		
	}
	
}
