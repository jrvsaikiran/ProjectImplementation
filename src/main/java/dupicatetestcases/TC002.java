package dupicatetestcases;



import org.testng.annotations.Test;

import utils.DP002;
import wrappers.GenericWrappers;

public class TC002 extends GenericWrappers {
	
	@Test(dataProvider="fetchData",dataProviderClass=DP002.class)
	
	public void formC(String u_id, String u_pwd, String u_repwd , String u_secques , String u_secans,String u_name,
			String u_gender,
			String u_dob, String u_designation,String u_emailid, String u_mobile, String u_phone,
			String u_nationality, String name, String capacity, String address, String state, String city_distr, 
			 String acco_type ,String star_rat, String email,String mcontact , String  contact,
			 String name_o, String address_o, String state_o, String citydistr_o,
			 String emailid_o, String phoneno_o , String mobile_o) {
	
		
		
		
		int states = Integer.parseInt(state);
		int city = Integer.parseInt(city_distr);
		//int frro = Integer.parseInt(frrodata);
		int acco = Integer.parseInt(acco_type);
		int star = Integer.parseInt(star_rat);
		int stateo = Integer.parseInt(state_o);
		int cityo = Integer.parseInt(citydistr_o);
		
		invokeApp("chrome", "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
		clickByXpath("/html/body/table/tbody/tr[1]/td/center[1]/table/tbody/tr[1]/td/a");
		enterById("u_id", u_id);
		enterById("u_pwd", u_pwd);
		enterById("u_repwd", u_repwd);
		selectVisibileTextById("u_secques",u_secques);
		enterById("u_secans", u_secans);
		enterById("u_name", u_name);
		int gender = Integer.parseInt(u_gender);
		
		selectIndexById("u_gender", gender);
		
		enterById("u_dob", u_dob);
		enterById("u_designation", u_designation);
		enterById("u_emailid", u_emailid);
		enterById("u_mobile", u_mobile);
		enterById("u_phone", u_phone);
		selectVisibileTextById("u_nationality", u_nationality);
		enterById("name", name);
		enterById("capacity", capacity);
		enterById("address", address);
		selectIndexById("state", states);
		waitTime(3000);
		selectIndexById("city_distr", city);
		//selectIndexById("frrodata", frro);
		selectIndexById("acco_type", acco);
		selectIndexById("star_rat", star);
		enterById("email", email);
		enterById("mcontact", mcontact);
		enterById("contact", contact);
		enterByName("name_o", name_o);
		enterByName("address_o", address_o);
		selectIndexById("state_o", stateo);
		waitTime(3000);
		selectIndexById("citydistr_o", cityo);
		enterByName("emailid_o", emailid_o);
		enterByName("phoneno_o", phoneno_o);
		enterByName("mobile_o", mobile_o);
		
	}
	

}

	


