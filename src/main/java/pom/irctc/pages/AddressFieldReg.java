package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AddressFieldReg extends GenericWrappers{
	
	
	
	public AddressFieldReg(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public AddressFieldReg enterFlatDoorNumber(String data) {
		enterByXpath(prop.getProperty("AddressFieldReg.xpath.enterFlatDoorNumber"), data);
		return this;
	}
	public AddressFieldReg enterStreetLane(String data) {
		enterByXpath(prop.getProperty("AddressFieldReg.xpath.enterStreetLane"), data);
		return this;
	}
	public AddressFieldReg enterAddressLocality(String data) {
		enterByXpath(prop.getProperty("AddressFieldReg.xpath.enterAddressLocality"), data);
		return this;
	}
	public AddressFieldReg enterPincode(String data) {
		enterByXpath(prop.getProperty("AddressFieldReg.xpath.enterPincode"), data);
		return this;
	}
	public AddressFieldReg enterState(String data) {
		enterByXpath(prop.getProperty("AddressFieldReg.xpath.enterState"), data);
		return this;
	}
	
	public AddressFieldReg enterCity(String data) {
		enterByXpath(prop.getProperty("AddressFieldReg.xpath.enterCity"), data);
		return this;
	}
	public AddressFieldReg enterPostOffice(String data) {
		enterByXpath(prop.getProperty("AddressFieldReg.xpath.enterPostOffice"), data);
		return this;
	}
	
	
	
	
	
	
	
	
	public AddressFieldReg selectCity(String value) {
		selectVisibileTextByXpath(prop.getProperty("AddressFieldReg.xpath.selectCity"), value);
		return this;
	}
	public AddressFieldReg selectPostOffice(String value) {
		selectVisibileTextByXpath(prop.getProperty("AddressFieldReg.xpath.selectPostOffice"), value);
		return this;
	}
	public AddressFieldReg enterPhoneNumber(String data) {
		enterByXpath(prop.getProperty("AddressFieldReg.xpath.enterPhoneNumber"), data);
		return this;
	}
	public AddressFieldReg clickOnNo() {
		clickByXpath(prop.getProperty("AddressFieldReg.xpath.clickOnNo"));
		return this;
	}
	public AddressFieldReg enterResidenceFlatDoorNumber(String data) {
		enterByXpath(prop.getProperty("AddressFieldReg.xpath.enterResidenceFlatDoorNumber"), data);
		return this;
	}
	public AddressFieldReg enterResidenceStreetLane(String data) {
		enterByXpath(prop.getProperty("AddressFieldReg.xpath.enterResidenceStreetLane"), data);
		return this;
	}
	public AddressFieldReg enterResidenceAddressLocality(String data) {
		enterByXpath(prop.getProperty("AddressFieldReg.xpath.enterResidenceAddressLocality"), data);
		return this;
	}
	public AddressFieldReg clickOnCountry() {
		clickByXpath(prop.getProperty("AddressFieldReg.xpath.clickOnCountry"));
		return this;
	}
	public AddressFieldReg clickOnSpecificCountry(String nameofcountry) {
		clickByXpath(prop.getProperty("AddressFieldReg.xpath.clickOnSpecificCountry"), nameofcountry);
		return this;
	}
	public AddressFieldReg enterResidencePincode(String data) {
		enterByXpath(prop.getProperty("AddressFieldReg.xpath.enterResidencePincode"), data);
		return this;
	}
	public AddressFieldReg enterResidenceOfficeState(String data) {
		enterByXpath(prop.getProperty("AddressFieldReg.xpath.enterResidenceOfficeState"), data);
		return this;
	}
	public AddressFieldReg enterResidencecity(String data) {
		enterByXpath(prop.getProperty("AddressFieldReg.xpath.enterResidencecity"), data);
		return this;
	}
	public AddressFieldReg selectCict(String value) {
		selectVisibileTextByXpath(prop.getProperty("AddressFieldReg.xpath.selectCict"), value);
		return this;
	}
	public AddressFieldReg selectPostOffice1(String value) {
		selectVisibileTextByXpath(prop.getProperty("AddressFieldReg.xpath.selectPostOffice1"), value);
		return this;
	}
	
	
	
	public AddressFieldReg enterResidenceOfficePostoffice(String data) {
		enterByXpath(prop.getProperty("AddressFieldReg.xpath.enterResidenceOfficePostoffice"), data);
		return this;
	}
	public AddressFieldReg enterResidencePhoneNumber(String data) {
		enterByXpath(prop.getProperty("AddressFieldReg.xpath.enterResidencePhoneNumber"), data);
		return this;
	}
	public AddressFieldReg clickOnTermsConditions() {
		clickByXpath(prop.getProperty("AddressFieldReg.xpath.clickOnTermsConditions"));
		return this;
	}
	
	
}
