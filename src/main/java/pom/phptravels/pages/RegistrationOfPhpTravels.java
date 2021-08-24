package pom.phptravels.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationOfPhpTravels extends GenericWrappers {
	
	public RegistrationOfPhpTravels(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver; 
		this.test = test;
	}
	
	public RegistrationOfPhpTravels enterFirstName(String data) {
		enterByXpath(prop.getProperty("RegistrationOfPhpTravels.xpath.enterFirstName"), data);
		return this;
	}
	public RegistrationOfPhpTravels enterLastName(String data) {
		enterByXpath(prop.getProperty("RegistrationOfPhpTravels.xpath.enterLastName"), data);
		return this;
	}
	public RegistrationOfPhpTravels enterEmailId(String data) {
		enterByXpath(prop.getProperty("RegistrationOfPhpTravels.xpath.enterEmailId"), data);
		return this;
	}
	public RegistrationOfPhpTravels clickONNation() {
		clickByXpath(prop.getProperty("RegistrationOfPhpTravels.xpath.clickONNation"));
		return this;
	}
	
	public RegistrationOfPhpTravels clickByNation() {
		clickByXpath(prop.getProperty("RegistrationOfPhpTravels.xpath.clickByNation"));
		return this;
	}
	
	public RegistrationOfPhpTravels enterPhoneNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationOfPhpTravels.xpath.enterPhoneNumber"), data);
		return this;
	}
	public RegistrationOfPhpTravels enterCompanyName(String data) {
		enterByXpath(prop.getProperty("RegistrationOfPhpTravels.xpath.enterCompanyName"), data);
		return this;
	}
	public RegistrationOfPhpTravels enterStreetAddress(String data) {
		enterByXpath(prop.getProperty("RegistrationOfPhpTravels.xpath.enterStreetAddress"), data);
		return this;
	}
	public RegistrationOfPhpTravels enterStreetAddress1(String data) {
		enterByXpath(prop.getProperty("RegistrationOfPhpTravels.xpath.enterStreetAddress1"), data);
		return this;
	}
	public RegistrationOfPhpTravels entercity(String data) {
		enterByXpath(prop.getProperty("RegistrationOfPhpTravels.xpath.entercity"), data);
		return this;
	}
	public RegistrationOfPhpTravels enterState(String data) {
		enterByXpath(prop.getProperty("RegistrationOfPhpTravels.xpath.enterState"), data);
		return this;
	}

	
	
	public RegistrationOfPhpTravels enterPostCode(String data) {
		enterByXpath(prop.getProperty("RegistrationOfPhpTravels.xpath.enterPostCode"), data);
		return this;
	}
	public RegistrationOfPhpTravels selectCountry(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationOfPhpTravels.xpath.selectCountry"), value);
		
		return this;
	}
	
	public RegistrationOfPhpTravels enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationOfPhpTravels.xpath.enterMobileNumber"), data);
		return this;
	}
	public RegistrationOfPhpTravels enterPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationOfPhpTravels.xpath.enterPassword"), data);
		return this;
	}
	public RegistrationOfPhpTravels enterConformPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationOfPhpTravels.xpath.enterConformPassword"), data);
		return this;
	}
	
}
