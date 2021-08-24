package pom.facebook.pages;
import org.openqa.selenium.remote.RemoteWebDriver; 
import com.relevantcodes.extentreports.ExtentTest;
import wrappers.GenericWrappers;


public class SignUpPage extends GenericWrappers {
	
	public SignUpPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver; 
		this.test = test;
	}

	
	public SignUpPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("SignUpPage.xpath.enterFirstName"), data);
		return this;
	}
	public SignUpPage enterSecondName(String data) {
		enterByXpath(prop.getProperty("SignUpPage.xpath.enterSecondName"), data);
		return this;
	}
	
	public SignUpPage enterMobileNumberOrEmail(String data) {
		enterByXpath(prop.getProperty("SignUpPage.xpath.enterMobileNumberOrEmail"), data);
		return this;
	}
	public SignUpPage enterNewPassword(String data) {
		enterByXpath(prop.getProperty("SignUpPage.xpath.enterNewPassword"), data);
		return this;
	}
	
	
	
	//String day;
	public SignUpPage selectDay(String value) {
		selectVisibileTextByXpath(prop.getProperty("SignUpPage.xpath.selectDay"), value);
		//clickByXpath(prop.getProperty("SignUpPage.clickOnDay.xpath"));
		//option[text()='2']
		return this;
	}
	public SignUpPage selectMonth(String value) {
		selectVisibileTextByXpath(prop.getProperty("SignUpPage.selectMonth.xpath"), value);
		return this;
	}
	public SignUpPage selectYear(String value) {
		selectVisibileTextByXpath(prop.getProperty("SignUpPage.selectYear.xpath"), value);
		return this;
	}
	
	public SignUpPage clickOnGender(String gender) {
		clickByXpath(prop.getProperty("SignUpPage.clickOnGender.xpath"), gender);
		
	//String newXpath = 	replaceXpath(prop.getProperty("SignUpPage.clickOnGender.xpath"),gender);
		//clickByXpath(newXpath);
	return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public SignUpPage clickOnFemale() {
		clickByXpath("//input[@value='1' and @name='sex']");
		return this;
	}
	public SignUpPage clickOnMale() {
		clickByXpath("(//input[@value='1' and @name='sex']/following::input)[1]");
		return this;
	}
	public SignUpPage clickOnCustom() {
		clickByXpath("(//input[@value='-1' and @name='sex']");
		return this;
	}
	public SignUpPage selectYourPronoun(String value) {
		selectVisibileTextByXpath("//select[starts-with(@name,'preferred_pronoun')]", value);
		return this;
	}
	public SignUpPage genderOptional(String data) {
		enterByXpath("//input[@name='custom_gender']", data);
		return this;
	}
	
	
}
