package testcases;


import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TC003 extends GenericWrappers{
@Test
	public void panCardApp() {
	invokeApp("chrome", "https://panind.com/india/new_pan/#");
	selectIndexById("pan_title", 1);
	enterById("pan_firstname", "saikiran");
	enterById("pan_middlename", "jakkula");
	enterById("pan_lastname", "rajavenkata");
	enterById("pan_fatherfirstname", "srinivasarao");
	enterById("pan_fathermiddlename", "jakkula");
	enterById("pan_fatherlastname", "vasu");	
	enterById("pan_mobilenumber", "7013970009");
	enterById("pan_email", "jakkula@gmail.com");
	selectIndexById("pan_sourceofincome", 3);
	selectIndexById("pan_businessprofession", 6);
	clickById("office");
	enterById("pan_dob", "03111995");
	enterById("pan_addressline1", "park street sap");
	enterById("pan_addressline2", "guntur district");
	enterById("pan_cityname", "sattenapalli");
	selectIndexById("pan_state", 2);
	pageDownByXpath("//html/body");
	enterById("pan_pincode", "522403");
	enterById("pan_officename", "boarvelsjcb");
	enterById("pan_officeaddressline1", "park nagar");
	enterById("pan_officeaddressline2", "main street");
	enterById("pan_officecityname", "guntur");
	selectIndexById("pan_officestate", 2);
	enterById("pan_officepincode","522403");
	selectIndexById("pan_identityproof", 1);
	selectIndexById("pan_addressproof", 2);
	selectIndexById("pan_DOBproof", 3);
	pageDownByXpath("//html/body");
	selectIndexById("pan_aadhaarproof", 3);
	selectIndexById("pan_officeaddressproof", 2);
	clickById("pan_source");
	
		
	}
	
	
}
