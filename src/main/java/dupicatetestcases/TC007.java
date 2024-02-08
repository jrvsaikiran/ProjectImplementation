package dupicatetestcases;



import org.testng.annotations.Test;

import utils.DP007;
import wrappers.GenericWrappers;

public class TC007 extends GenericWrappers {
	
		@Test(dataProvider = "fetchData" , dataProviderClass = DP007.class)
		public void saloonBook(String name, String organization, String address, String mobile,
				String email, String originStation, String destnStation, String durationPeriod,
				String coachDetails, String numPassenger, String charterPurpose, String services ) {
			
			invokeApp("chrome", "https://www.irctc.co.in/nget/train-search");			
			clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");			
			clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]");			
			clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]");			
			clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span");		
			switchToLastWindow();			
			clickByXpath("//*[@id=\"sidebarCollapse\"]/i");			
			clickByLink("Charter");			
			clickByXpath("//*[@id=\"dismiss\"]/i");	
			waitTime(5000);
			clickByLink("Enquiry Form");			
			enterByName("name", name);			
			enterByName("organization", organization);			
			enterByName("address", address);		
			enterByName("mobile", mobile);			
			enterByName("email", email);			
			selectIndexByXpath("//*[@id=\"enquiry\"]/div/form/div/div[6]/select", 1);			
			enterByName("originStation", originStation);		
			enterByName("destnStation", destnStation);			
			clickByName("checkInDate");			
			clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/tbody/tr[4]/td[3]/span");
			waitTime(5000);	
			clickByName("checkOutDate");			
			clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/tbody/tr[5]/td[6]/span");			
			waitTime(5000);
			enterByName("durationPeriod", durationPeriod);			
			enterByName("coachDetails", coachDetails);			
			enterByName("numPassenger", numPassenger);			
			enterByName("charterPurpose", charterPurpose);			
			enterByName("services",services);			
			clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[17]/button/i");		
			verifyTextByXpath("//*[@id=\"enquiry\"]/div/form/div/div[4]/span", "Mobile no not valid");
			getTextByXpath("//*[@id=\"enquiry\"]/div/form/div/div[4]/input");

}
}
