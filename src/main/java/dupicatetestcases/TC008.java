package dupicatetestcases;



import org.testng.annotations.Test;

import utils.DP008;
import wrappers.GenericWrappers;

public class TC008 extends GenericWrappers{


	@Test(dataProvider ="fetchData" , dataProviderClass = DP008.class)
	public void bookRoomsWithGst(String firstName, String lastName,String gstNumber,
			String companyName,String companyAddress) {
		
		invokeApp("chrome", "https://www.irctc.co.in/nget/train-search");	
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]");		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]");		
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span");	
		switchToLastWindow();
		clickByXpath("/html/body/app-root/accommodation/div[2]/div[1]/ul/li[2]/a");		
		switchToLastWindow();		
		enterByXpath("//*[@id=\"TravellerEconomydropdown\"]/div[1]/searchbox/input", "Tirupati");		
		waitTime(3000);		
		clickByXpath("//*[@id=\"TravellerEconomydropdown\"]/div[1]/searchbox/div/ul/li/a/div[2]/strong");		
		clickByName("dt12");		
		clickByXpath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[1]/button[2]/span");		
		clickByXpath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[1]/td[6]/span");		
		clickByName("dt13");		
		clickByXpath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[2]/td[6]/span");	
		clickById("user-data-wrapper-id");		
		selectIndexByXpath("//*[@id=\"user-data-wrapper\"]/div[1]/div/div[2]/select", 2);		
		clickByXpath("//*[@id=\"user-data-wrapper\"]/div[2]/button");		
		clickByXpath("//*[@id=\"TravellerEconomydropdown\"]/div[5]/button");		
		waitTime(3000);		
		clickByXpath("/html/body/app-root/app-fulllayout/div/app-hotellist/main/div/div[2]/div/div[2]/div/div/div[3]/button");		
		waitTime(3000);		
		getTextByXpath("/html/body/app-root/app-fulllayout/div/app-hoteldetail/main/div/div/div[2]/h3/a");		
		getTextByXpath("//*[@id=\"hotel-dtl-sticky-rooms\"]/div[2]/div[2]/div[1]/div");		
		clickByXpath("//*[@id=\"hotel-dtl-sticky-photo\"]/div[1]/div[1]/div[2]/div/div/div[4]/button");		
		waitTime(3000);		
		enterByXpath("//*[@id=\"materialLoginFormEmail22\"]", "kiran@gmail.com");		
		enterByXpath("//*[@id=\"materialLoginFormPassword1\"]", "8985891589");		
		clickByXpath("/html/body/app-root/app-fulllayout/div/app-login/main/div/div/div[2]/div/div/div[2]/div[2]/div/div/form/button");
		waitTime(3000);
		selectIndexByXpath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[1]/div/select", 1);
		waitTime(3000);		
		enterByName("firstName", firstName);		
		enterByName("lastName", lastName);		
		selectIndexByXpath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[5]/div/select",2);		
		selectIndexByXpath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[8]/div/select", 1);		
		enterByName("gstNumber", gstNumber);		
		enterByName("companyName", companyName);		
		enterByName("companyAddress", companyAddress);		
		clickByXpath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[12]/button[2]");		
		verifyTextByXpath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[9]/div/span", "Please Enter Valid GST Number");
		//verifyTextContainsByXpath("/html/body/app-root/app-fulllayout/div/app-paxdetail/main/div/div[1]/form/div/div[9]/div/span", "Please Enter Valid GST Number");
}
}
