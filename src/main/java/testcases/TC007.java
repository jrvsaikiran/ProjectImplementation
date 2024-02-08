package testcases;



import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TC007 extends GenericWrappers {
	
		@Test
		public void saloonBook() {
			
			invokeApp("chrome", "https://www.irctc.co.in/nget/train-search");			
			clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");			
			clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]");			
			clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]");			
			clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span");		
			switchToLastWindow();			
			clickByXpath("//*[@id=\"sidebarCollapse\"]/i");			
			clickByLink("Charter");			
			clickByXpath("//*[@id=\"dismiss\"]/i");			
			clickByLink("Enquiry Form");			
			enterByName("name", "sai");			
			enterByName("organization", "srm");			
			enterByName("address", "park");		
			enterByName("mobile", "78969541236");			
			enterByName("email", "sai@gmail.com");			
			selectIndexByXpath("//*[@id=\"enquiry\"]/div/form/div/div[6]/select", 1);			
			enterByName("originStation", "Guntur");		
			enterByName("destnStation", "chennai");			
			clickByName("checkInDate");			
			clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/tbody/tr[4]/td[3]/span");
			waitTime(5000);	
			clickByName("checkOutDate");			
			clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/tbody/tr[5]/td[6]/span");			
			waitTime(5000);
			enterByName("durationPeriod", "5");			
			enterByName("coachDetails", "2");			
			enterByName("numPassenger", "50");			
			enterByName("charterPurpose", "tour");			
			enterByName("services","snakes");			
			//clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[17]/button");		
			verifyTextByXpath("//*[@id=\"enquiry\"]/div/form/div/div[4]/span", "Mobile no. not valid");
			
}
}
