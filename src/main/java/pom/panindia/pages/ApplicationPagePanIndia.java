package pom.panindia.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class ApplicationPagePanIndia extends GenericWrappers{
	
	
	public ApplicationPagePanIndia(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver; 
		this.test = test;
	}
	
	
	
	public ApplicationPagePanIndia selectTitle(String value) {
		selectVisibileTextByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.selectTitle"), value);
		return this;
	}
	public ApplicationPagePanIndia enterFirstName(String data) {
		enterByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.enterFirstName"), data);
		return this;
	}
	public ApplicationPagePanIndia enterMiddleName(String data) {
		enterByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.enterMiddleName"), data);
		return this;
	}
	public ApplicationPagePanIndia enterLastName(String data) {
		enterByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.enterLastName"), data);
		return this;
	}
	public ApplicationPagePanIndia enterFathersFirstName(String data) {
		enterByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.enterFathersFirstName"), data);
		return this;
	}
	public ApplicationPagePanIndia enterFathersMiddleName(String data) {
		enterByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.enterFathersMiddleName"), data);
		return this;
	}
	public ApplicationPagePanIndia enterFathersLastName(String data) {
		enterByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.enterFathersLastName"), data);
		return this;
	}
	public ApplicationPagePanIndia enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.enterMobileNumber"), data);
		return this;
	}
	public ApplicationPagePanIndia enterEmail(String data) {
		enterByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.enterEmail"), data);
		return this;
	}
	public ApplicationPagePanIndia selectSourceOfIncome(String data) {
		enterByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.selectSourceOfIncome"), data);
		return this;
	}
	
	public ApplicationPagePanIndia pageDown() {
		pageDownByXpath("//html/body");
	
		return this;
		
	}
	
	
	public ApplicationPagePanIndia clickOnResidence() {
		clickByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.clickOnResidence"));
		return this;
	}
	
	
	
	
	
	
	
	public ApplicationPagePanIndia clickOnOffice() {
		clickByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.clickOnOffice"));
		return this;
	}
	public ApplicationPagePanIndia enterDateOfBirth(String data) {
		enterByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.enterDateOfBirth"), data);
		return this;
	}
	public ApplicationPagePanIndia enterHouseNumberOrBuildingNumber(String data) {
		enterByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.enterHouseNumberOrBuildingNumber"), data);
		return this;
	}
	public ApplicationPagePanIndia enterAreaOrRoadStreet(String data) {
		enterByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.enterAreaOrRoadStreet"), data);
		return this;
	}
	public ApplicationPagePanIndia enterCItyOrTownOrDistrict(String data) {
		enterByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.enterCItyOrTownOrDistrict"), data);
		return this;
	}
	public ApplicationPagePanIndia selectStateOrUnionTeritory(String value) {
		selectVisibileTextByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.selectStateOrUnionTeritory"), value);
		return this;
	}
	public ApplicationPagePanIndia selectCountry(String value) {
		selectVisibileTextByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.selectCountry"), value);
		return this;
	}
	public ApplicationPagePanIndia enterPinCode(String data) {
		enterByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.enterPinCode"), data);
		return this;
	}
	
	
	public ApplicationPagePanIndia enterNameOfOffice(String data) {
		enterByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.enterNameOfOffice"), data);
		return this;
	}
	public ApplicationPagePanIndia enterHouseNumber(String data) {
		enterByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.enterHouseNumber"), data);
		return this;
	}
	public ApplicationPagePanIndia enterAreaStreet(String data) {
		enterByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.enterAreaStreet"), data);
		return this;
	}
	public ApplicationPagePanIndia enterCity(String data) {
		enterByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.enterCity"), data);
		return this;
	}
	public ApplicationPagePanIndia selectOfficeState(String value) {
		selectVisibileTextByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.selectOfficeState"), value);
		return this;
	}
	
	public ApplicationPagePanIndia enterPincode(String data) {
		enterByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.enterPincode"), data);
		return this;
	}
	
	
	
	
	
	public ApplicationPagePanIndia selectIdentityProof(String value) {
		selectVisibileTextByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.selectIdentityProof"), value);
		return this;
	}
	public ApplicationPagePanIndia selectAddressProof(String value) {
		selectVisibileTextByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.selectAddressProof"), value);
		return this;
	}
	public ApplicationPagePanIndia selectDateOfBirthProof(String value) {
		selectVisibileTextByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.selectDateOfBirthProof"), value);
		return this;
	}
	public ApplicationPagePanIndia selectDateOfBirthProof1(int value) {
		selectIndexByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.selectDateOfBirthProof1"), value);
		return this;
	}
	
	public ApplicationPagePanIndia selectAadarProof1(String value) {
		selectVisibileTextByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.selectAadarProof1"), value);
		return this;
	}
	
	
	
	
	public ApplicationPagePanIndia selectAadarProof(String value) {
		selectVisibileTextByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.selectOfficeAddressProof"), value);
		return this;
	}
	public ApplicationPagePanIndia selectOfficeAddressProof(String value) {
		selectVisibileTextByXpath("//select[@name='pan_officeaddressproof']", value);
		return this;
	}
	public ApplicationPagePanIndia clickOnAgree() {
		clickByXpath(prop.getProperty("ApplicationPagePanIndia.xpath.clickOnAgree"));
		return this;
	}
	
	
}
