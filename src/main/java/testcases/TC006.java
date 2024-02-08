package testcases;



import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TC006 extends GenericWrappers{

	@Test
	public void ircteReg() {
	invokeApp("chrome", "https://www.irctc.co.in");	
	clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
	waitTime(3000);
	clickByLink("REGISTER");	
	waitTime(4000);	
	enterById("userName", "kiran345");		
	enterById("usrPwd", "Ss@8985891589");	
	enterById("cnfUsrPwd", "Ss@8985891589");
	pageDownByXpath("//html/body");
	clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[3]/span");
	clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li");
	clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[3]/span");
	clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li");	
	enterByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input", "kiran");	
	clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");	
	waitTime(3000);	
	enterById("firstName", "kiran");	
	enterById("middleName", "sai");	
	enterById("lastname", "jrv");	
	clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[3]/span");	
	clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[5]/li/span");	
	enterByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input", "20-04-1996");	
	clickByXpath("//*[@id=\"unmarried\"]/div/div[2]");	
	clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[1]/span");	
	enterById("email", "Batman.Gotham@gmail.com");	
	enterById("mobile", "7854219630");	
	selectIndexByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select", 2);	
	waitTime(5000);
	clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");	
	waitTime(3000);
	enterById("resAddress1", "10-5-55");	
	enterById("resAddress2", "nagar");	
	enterById("resAddress3", "Guntur");	
	enterByName("resPinCode", "522403");	
	waitTime(3000);	
	clickById("resState");
	waitTime(3000);
	selectIndexByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[6]/select",1);
	waitTime(5000);	
	selectIndexByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[7]/select", 2);	
	enterById("resPhone", "8985891589");	
	clickByXpath("//*[@id=\"no\"]/div/div[2]");	
	enterById("offAddress1", "10-5-55");	
	enterById("offAddress2", "sap");	
	enterById("offAddress3", "sattenapalli");	
	clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div/div[3]/span");	
	clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[105]/li");	
	enterById("offPinCode", "522403");	
	enterById("offState", "Andhra Pradesh");	
	enterById("offCity", "Guntur");	
	enterById("offPostOff", "sap");	
	enterById("offPhone", "7894561230");
	
	}
}
