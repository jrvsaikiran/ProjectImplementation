package dupicatetestcases;



import org.testng.annotations.Test;

import utils.DP005;
import wrappers.GenericWrappers;

public class TC005 extends GenericWrappers {

	@Test(dataProvider ="fetchData" , dataProviderClass = DP005.class)
	public void fteRailway(String  userId, String password, String cnfPassword, String secQstn,
			String  secAnswer, String email, String occupation, String fname,
			String  mname, String lname, String natinality, String flatNo,
			String  street, String area, String country, String mobile, 
			String pincode, String postOffice, String flatNoOffice, String streetOffice,
			String areaOffice, String countryOffice, String mobileOffice, String pincodeOffice,
			String postOfficeOffice) { 
		
	int question = Integer.parseInt(secQstn);
	int occ = Integer.parseInt(occupation);
	int nation = Integer.parseInt(natinality);
	int countri = Integer.parseInt(country);
	int countyi = Integer.parseInt(countryOffice);
	
		
	invokeApp("chrome","https://www.ftr.irctc.co.in/ftr/");	
	clickByXpath("//*[@id=\"planner\"]/table/tbody/tr[4]/td[2]/div/a[2]");	
	enterById("userId",userId);	
	enterById("password", password);	
	enterById("cnfPassword", cnfPassword);	
	selectIndexById("secQstn", question);	
	enterById("secAnswer", secAnswer);	
	clickByXpath("//*[@id=\"dateOfBirth\"]");	
	clickByXpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[6]/a");	
	clickById("gender0");	
	clickById("maritalStatus1");	
	enterById("email", email);	
	selectIndexById("occupation", occ);	
	enterById("fname", fname);	
	enterById("mname", mname);	
	enterById("lname", lname);		
	selectIndexById("natinality", nation);	
	enterById("flatNo", flatNo);	
	enterById("street", street);	
	enterById("area", area);	
	selectIndexById("country", countri);
	pageDownByXpath("//html/body");
	enterById("mobile", mobile);	
	enterById("pincode", pincode);		
	waitTime(13000);	
	clickById("postOffice");
	selectVisibileTextById("postOffice", postOffice);	
	waitTime(5000);
	pageDownByXpath("//html/body");	
	clickByXpath("//*[@id=\"sameAddresses1\"]");
	enterById("flatNoOffice", flatNoOffice);	
	enterById("streetOffice", streetOffice);	
	enterById("areaOffice", areaOffice);	
	selectIndexById("countryOffice", countyi);	
	enterById("mobileOffice", mobileOffice);
	enterById("pincodeOffice", pincodeOffice);		
	waitTime(7000);
	clickById("postOfficeOffice");
	waitTime(5000);
	selectVisibileTextById("postOfficeOffice", postOfficeOffice);	
	pageDownByXpath("//html/body");	
		
	}
	
}
