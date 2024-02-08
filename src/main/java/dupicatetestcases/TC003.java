package dupicatetestcases;


import org.testng.annotations.Test;

import utils.DP003;
import wrappers.GenericWrappers;

public class TC003 extends GenericWrappers{
//@Test
	@Test(dataProvider = "fetchData", dataProviderClass= DP003.class)
	public void panCardApp(
			String pan_title, String pan_firstname, String pan_middlename, String pan_lastname,
			String pan_fatherfirstname, String pan_fathermiddlename, String pan_fatherlastname, String pan_mobilenumber,
			String pan_email, String pan_sourceofincome, String pan_businessprofession, String pan_dob,
			String pan_addressline1, String pan_addressline2, String pan_cityname, String pan_state,
			String pan_pincode, String pan_officename, String pan_officeaddressline1, String pan_officeaddressline2,
			String pan_officecityname, String pan_officestate, String pan_officepincode, String pan_identityproof,
			String pan_addressproof, String pan_DOBproof, String pan_aadhaarproof, String pan_officeaddressproof) {
	
	int title = Integer.parseInt(pan_title);
	int source = Integer.parseInt(pan_sourceofincome);
	int business = Integer.parseInt(pan_businessprofession);
	int state = Integer.parseInt(pan_state);
	int office = Integer.parseInt(pan_officestate);
	int idProof = Integer.parseInt(pan_identityproof);
	int address = Integer.parseInt(pan_addressproof);
	int dob = Integer.parseInt(pan_DOBproof);
	int adar = Integer.parseInt(pan_aadhaarproof);
	int offAddre = Integer.parseInt(pan_officeaddressproof);
	
	
		
	invokeApp("chrome", "https://panind.com/india/new_pan/#");
	selectIndexById("pan_title", title);
	enterById("pan_firstname", pan_firstname);
	enterById("pan_middlename", pan_middlename);
	enterById("pan_lastname", pan_lastname);
	enterById("pan_fatherfirstname", pan_fatherfirstname);
	enterById("pan_fathermiddlename", pan_fathermiddlename);
	enterById("pan_fatherlastname", pan_fatherlastname);	
	enterById("pan_mobilenumber", pan_mobilenumber);
	enterById("pan_email", pan_email);
	selectIndexById("pan_sourceofincome", source);
	selectIndexById("pan_businessprofession", business);
	clickById("office");
	enterById("pan_dob", pan_dob);
	enterById("pan_addressline1", pan_addressline1);
	enterById("pan_cityname", pan_cityname);
	selectIndexById("pan_state", state);
	pageDownByXpath("//html/body");
	enterById("pan_pincode", pan_pincode);
	enterById("pan_officename", pan_officename);
	enterById("pan_officeaddressline1", pan_officeaddressline1);
	enterById("pan_officeaddressline2", pan_officeaddressline2);
	enterById("pan_officecityname", pan_officecityname);
	selectIndexById("pan_officestate", office);
	enterById("pan_officepincode",pan_officepincode);
	selectIndexById("pan_identityproof", idProof);
	selectIndexById("pan_addressproof", address);
	selectIndexById("pan_DOBproof", dob);
	pageDownByXpath("//html/body");
	selectIndexById("pan_aadhaarproof", adar);
	selectIndexById("pan_officeaddressproof", offAddre);
	clickById("pan_source");
	
		
	}
	
	
}
