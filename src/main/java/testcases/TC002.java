package testcases;



import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TC002 extends GenericWrappers {
	@Test
	public void formC() {
		invokeApp("chrome", "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
		clickByXpath("/html/body/table/tbody/tr[1]/td/center[1]/table/tbody/tr[1]/td/a");
		enterById("u_id", "Kasai207893097");
		enterById("u_pwd", "Ss@7013970009");
		enterById("u_repwd", "Ss@7013970009");
		selectVisibileTextById("u_secques", "What is your favorite author?");
		enterById("u_secans", "jrvsaikiran");
		enterById("u_name", "saikiran");
		selectIndexById("u_gender", 1);
		enterById("u_dob", "03/11/1995");
		enterById("u_designation", "Mtech");
		enterById("u_emailid", "saikiran@gmail.com");
		enterById("u_mobile", "7013970009");
		enterById("u_phone", "8985891589");
		selectVisibileTextById("u_nationality", "INDIA");
		enterById("name", "akbar");
		enterById("capacity", "10");
		enterById("address", "park road sattenapalli");
		selectIndexById("state", 2);
		selectIndexById("city_distr", 4);
		selectIndexById("frrodata", 1);
		selectIndexById("acco_type", 6);
		selectIndexById("star_rat", 5);
		enterById("email", "saikirabjrv@gmail.com");
		enterById("mcontact", "7257892478");
		enterById("contact", "7013970009");
		enterByName("name_o", "kiran");
		enterByName("address_o", "park raod guntur");
		selectIndexById("state_o", 2);
		selectIndexById("citydistr_o", 2);
		enterByName("emailid_o","kiran@gmail.com");
		enterByName("phoneno_o", "1234567889");
		enterByName("mobile_o", "7896541230");
		
	}
	
	
}
