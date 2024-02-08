package dupicatetestcases;



import org.testng.annotations.Test;

import utils.DP006;
import wrappers.GenericWrappers;

public class TC006 extends GenericWrappers{

	@Test(dataProvider="fetchData",dataProviderClass=DP006.class)
	
	//@Test
	public void ircteReg(String userName, String usrPwd, String  cnfUsrPwd, String firstName, String middleName, String  lastname, String email, String mobile, 
	String 	resAddress1, String resAddress2, String resAddress3, String resPinCode, String resPhone, String offAddress1, String offAddress2, String offAddress3,
	String offPinCode, String offState, String offCity, String offPostOff, String offPhone  ) {
		
	invokeApp("chrome", "https://www.irctc.co.in");	
	clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
	waitTime(3000);
	clickByLink("REGISTER");	
	waitTime(4000);	
	enterById("userName", userName);		
	enterById("usrPwd", usrPwd);	
	enterById("cnfUsrPwd", cnfUsrPwd);
	pageDownByXpath("//html/body");
	clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[3]/span");
	clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li");
	clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[3]/span");
	clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li");	
	enterByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input", "kiran");	
	clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");	
	waitTime(3000);	
	enterById("firstName", firstName);	
	enterById("middleName", middleName);	
	enterById("lastname", lastname);	
	clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[3]/span");	
	clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[5]/li/span");	
	enterByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input", "20-04-1996");	
	clickByXpath("//*[@id=\"unmarried\"]/div/div[2]");	
	clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[1]/span");	
	enterById("email", email);	
	enterById("mobile", mobile);	
	selectIndexByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select", 2);	
	waitTime(5000);
	clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");	
	waitTime(3000);
	enterById("resAddress1", resAddress1);	
	enterById("resAddress2", resAddress2);	
	enterById("resAddress3", resAddress3);	
	enterByName("resPinCode", resPinCode);	
	waitTime(3000);	
	clickById("resState");
	waitTime(3000);
	selectIndexByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[6]/select",1);
	waitTime(5000);	
	selectIndexByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[7]/select", 2);	
	enterById("resPhone", resPhone);	
	clickByXpath("//*[@id=\"no\"]/div/div[2]");	
	enterById("offAddress1", offAddress1);	
	enterById("offAddress2", offAddress2);	
	enterById("offAddress3", offAddress3);	
	clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div/div[3]/span");	
	clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[105]/li");	
	enterById("offPinCode", offPinCode);	
	enterById("offState", offState);	
	enterById("offCity", offCity);	
	enterById("offPostOff", offPostOff);	
	enterById("offPhone", offPhone);
	
	}
}
