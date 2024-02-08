package wrappers;

import java.io.File;  
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrappers implements Wrappers {
	

	RemoteWebDriver driver;
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
		try {
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			
			driver.manage().window().maximize();
			driver.get(url);
			System.out.println("the browser "+browser+" is launched with the given "+url+" successfully ");
			
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			System.err.println("the browser "+browser+" is not launched due to session not created error");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("the browser "+browser+" is not launche  due to unknown error");
		}finally {
			takeSnap();
		}
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			System.out.println("the element with id "+idValue+" is entered with data "+data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("the element with id "+idValue+" is not available in application");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("the element with id "+idValue+" is not visible in application");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("the element wit id "+idValue+" s not interactable in the application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("the element with id "+idValue+" is not stable in the application");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("the element with id "+idValue+" is not interactable due to unexpected alert in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("the element with id "+idValue+" is not entered with data "+data+" due to unknown error");
		}finally {
			takeSnap();
		}
	}

	public void enterByName(String nameValue, String data)  {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			System.out.println("the element eith name "+nameValue+" is entered with data"+data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("the element with name "+nameValue+" is not available in application");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("the element with name "+nameValue+" is not visible in application");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("the element wit name "+nameValue+" is not interactable in application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("the element with name "+nameValue+" is not visible in application");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("the element with name "+nameValue+" is not interactable due to unexpected alert in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("the element with name "+nameValue+" is not entered with data "+data+" due to unknown error ");
		}finally {
			takeSnap();
		}
		
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			System.out.println("the element with xpath "+xpathValue+" is entered with data "+data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("the element wit xpath "+xpathValue+" is not available in application");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("the element wit xpath "+xpathValue+" is not visible in application");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("the element with "+xpathValue+" is not interactable with appilication");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("the element with xpath "+xpathValue+" is not stable inapplication");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("the element with xpath "+xpathValue+" is not interactable due to unexpected alert in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println(" the element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error");
		} finally {
			takeSnap();
		}
		
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualTitle = driver.getTitle();
			if (actualTitle.equals(title)) {
				System.out.println("the title of page "+actualTitle+" is matched with expected title "+title);
			}else 
				System.out.println("the title of page "+actualTitle+" is not matched with " +title);
		}
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("the title of paage cannot be verified due to unknown error");
		}finally {
			takeSnap();
		}
		
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementById(id).getText();
			if(actualText.equals(text)) {
				System.out.println("the element with id holding text "+text+"  is matched with actualtext  "+actualText );
			}else {
				System.err.println("the element with id holding text "+text+"  is not matched with actualtext  "+actualText);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("the element with id "+id+" is not available in application");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("the element with id "+id+" is not visible in application");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("the element wit id "+id+" s not interactable in the application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("the element with id "+id+" is not stable in the application");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("the element with id "+id+" is not interactable due to unexpected alert in the application");
		}
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("the text cannot be located due to unknown error ");
		}finally {
			takeSnap();
		}
			
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if (actualText.equals(text)) {
				System.out.println("the element with xpath holding text "+text+"  is matched with actualtext  "+actualText);
			}else {
				System.err.println("the element with xpath holding text "+text+"  is not matched with actualtext  "+actualText);
			}
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("the element with xpath "+xpath+" is not available in application");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("the element with xpath "+xpath+" is not visible in application");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("the element wit xpath "+xpath+" s not interactable in the application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("the element with xpath "+xpath+" is not stable in the application");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("the element with xpath "+xpath+" is not interactable due to unexpected alert in the application");
		}
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("the text cannot be verified by unknownerror");
		}finally {
			takeSnap();
		}
		
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if (actualText.contains(text)) {
				System.out.println("the element with xpath holding text "+text+"  is matched with actualtext  "+actualText);
			}else {
				System.err.println("the element with xpath holding text "+text+"  is not matched with actualtext  "+actualText);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("the element with xpath "+xpath+" is not available in application");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("the element with xpath "+xpath+" is not visible in application");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("the element wit xpath "+xpath+" s not interactable in the application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("the element with xpath "+xpath+" is not stable in the application");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("the element with xpath "+xpath+" is not interactable due to unexpected alert in the application");
		}
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("the text cannot be verified by unknownerror");
		}finally {
			takeSnap();
		}
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			System.out.println("the element with id "+id+" is clicked");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("the element with id "+id+" is not available in application");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("the element with id "+id+" is not visible in application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("the element with id "+id+" is not stable in the application");
		}
		catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			System.err.println("the element with id "+id+" is unable to click");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("the element with id "+id+" is not interactable due to unexpected alert in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("the element with id "+id+" cannot be clicked by unknown error");
		}finally {
			takeSnap();
		}
		
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			System.out.println("the element with classname "+classVal+" is clicked");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println("The element with the classname"+classVal+"is not found in the DOM");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with the classname"+classVal+"is not interactable in the application");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with the classname"+classVal+"is not visible in the application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with the classname"+classVal+"is not stable in the application");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("the element with classname "+classVal+" is not interactable due to unexpected alert in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.out.println("The element with the classname"+classVal+"cannot be clicked due to unknown error");
		}finally {
			takeSnap();
		}
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			System.out.println("the element with name "+name+" is clicked");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println("The element with the name"+name+"is not found in the DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with the name"+name+"is not visible in the application");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with the name"+name+"is not interactable in the application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with the name"+name+"is not stable in the application");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("the element with name "+name+" is not interactable due to unexpected alert in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with the name"+name+"is not clicked due to unknown error");
		}finally {
			takeSnap();
		}
		
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			System.out.println("the element with link "+name+" is clicked");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println("The element with the link name"+name+"is not found in the DOM");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with the link name"+name+"is not interactable in the application");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with the link name"+name+"is not visible in the application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with the link name"+name+"is not stable in the application");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("the element with link "+name+" is not interactable due to unexpected alert in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with the link name"+name+"is not clicked due to unknown error");
		}finally {
			takeSnap();
		}
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			System.out.println("the element with xpath "+name+" is clicked");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("The element with the link name"+name+"is not visible in the DOM");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with the link name"+name+"is not interactable in the application");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with the link name"+name+"is not visible in the application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with the link name"+name+"is not stable in the application");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("the element with linktext "+name+" is not interactable due to unexpected alert in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with the link name"+name+"is not clicked due to unknown error");
		}finally {
		
		}
		
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("the element with xpath "+xpathVal+" is clicked");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("The element with the xpath"+xpathVal+"is not found in the DOM");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath"+xpathVal+"is not interactable in the application");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath"+xpathVal+"is not visible in the application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath"+xpathVal+"is not stable on the application");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("the element with xpath "+xpathVal+" is not interactable due to unexpected alert in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath"+xpathVal+"is not clicked due to unknown error");
		}finally {
			takeSnap();
		}
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("the element with xpath "+xpathVal+" is clicked");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("The element with the xpath"+xpathVal+"is not found in the DOM");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath"+xpathVal+"is not interactable in the application");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath"+xpathVal+"is not visible in the application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath"+xpathVal+"is not stable on the application");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("the element with xpath "+xpathVal+" is not interactable due to unexpected alert in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath"+xpathVal+"is not clicked due to unknown error");
		}
		
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String originalText = null;
		try {
			
			  originalText= driver.findElementById("idVal").getText();
			if(originalText.equals(idVal)) {
				System.out.println("the element with the id "+idVal+" is holding the text "+originalText+" is obtained from application");
			}else {
				System.err.println("the element with the id "+idVal+" is not holding the text "+originalText+" is obtained from application");
			}
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			
			System.err.println("The element with the id"+idVal+"is not found in the DOM");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with the id"+idVal+"is not interactable in the application");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with the id"+idVal+"is not visible in the application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with the id"+idVal+"is not stable in the application");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("the element with id "+idVal+" is not interactable due to unexpected alert in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The text of the element with id"+idVal+"is not obtained due to unknown error");
		}finally {
			takeSnap();
		}
	
		return originalText;
		
		
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String originalText =null;
		try {
			originalText = driver.findElementByXPath(xpathVal).getText();
			if(originalText.equals(xpathVal)) {
				System.out.println("the element with the xpath "+xpathVal+" is holding the text "+originalText+" is obtained from application");
			}else {
				System.err.println("the element with the xpath "+xpathVal+" is not holding the text "+originalText+" is obtained from application");
			}
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println("The element with the xpath"+xpathVal+"is not found in the DOM");
		}catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath"+xpathVal+"is not interactable in the application");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath"+xpathVal+"is not visible in the application");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath"+xpathVal+"is not stable in the application");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("the element with xpath "+xpathVal+" is not interactable due to unexpected alert in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The text of the element with xpath"+xpathVal+"is not obtained due to unknown error");
		}finally {
			takeSnap();
		}
		
		return originalText;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement text =  driver.findElementById(id);
			Select sc =new Select(text);
			sc.selectByVisibleText(value);
			System.out.println("the value selected from dropdown "+id+" is "+value);
		}  catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println("The element with the id"+id+"is not found in the DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with the id"+id+"is not visible in the application");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("The element with the id"+id+"is disabled in the appication");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with the id"+id+"is not stable in the application");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with the id"+id+"is not interactable in the application");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("the element with id "+id+" is not interactable due to unexpected alert in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The drop down visible text"+value+"of the element with id"+id+"is not selected due to unknown error");
		}finally {
			takeSnap();
		}
		
	}

	public void selectIndexById(String id, int value)  {
		// TODO Auto-generated method stub
		try {
			WebElement drop = driver.findElementById(id);
			Select sc = new Select(drop);
			sc.selectByIndex(value);
			System.out.println("the element id "+id+" is selected to dropdown" +value+" value");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println("The element with the id"+id+"is not found in the DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with the id"+id+"is not visible in the application");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("The element with the id"+id+"is disabled in the appication");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with the id"+id+"is not stable in the application");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with the id"+id+"is not interactable in the application");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("the element with id "+id+" is not interactable due to unexpected alert in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The drop down with index"+value+"of the element with id"+id+"is not selected due to unknown error");
		}finally {
			takeSnap();
		}
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> session = driver.getWindowHandles();
			
			for(String eachid : session) {
				driver.switchTo().window(eachid);
				break;
			}
				
			System.out.println("the window is switched to parent window" );
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println("The parent window is not available to switch");
		}catch (SessionNotCreatedException e) {
			// TODO: handle exception
			System.err.println("The session of the window is not created");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Cannot switch to the parent window due to unknown error");
		}catch (Throwable e) {
			// TODO: handle exception
			System.err.println("Cannot switch to parent window due to unknown error");
		}finally {
			takeSnap();
		}
		
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		
		try {
			Set<String> session = driver.getWindowHandles();
			
			for(String eachid : session) {
				driver.switchTo().window(eachid);
				
			}
				
			System.out.println("the window is switched to last window" );
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			System.err.println("The last window is not available to switch");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("Cannot switch to the last window due to unknown error");
		}catch (Throwable e) {
			// TODO: handle exception
			System.err.println("The control is not moved to the last window successfully");
		}finally {
			takeSnap();
		}
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			
			driver.switchTo().alert().accept();
			System.out.println(" The alert alertText is accepted ");
		}catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			
			System.err.println("frame is not available");
		}
		catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.err.println("the alert is not available to handle");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("unable to handle alert by unknown error");
		}finally {
			takeSnap();
		}		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			
			driver.switchTo().alert().dismiss();
			System.out.println(" The alert  alertText is dismissed ");
		}catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			
			System.err.println("frame is not available");
		}
		catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.err.println("the alert is not available to handle");
		}catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("unable to handle alert by unknown error");
		}	finally {
			takeSnap();
		}	
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String text = null;
		try {
			 text = driver.switchTo().alert().getText();
			
		}catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			
			System.err.println("frame is not available");
		}
		catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.err.println("the alert is not available to handle");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("the unexpected alert");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("unable to handle alert by unknown error");
		}finally {
			takeSnap();
		}
		return text;
	}

	public void takeSnap()   {
		// TODO Auto-generated method stub
		
		try {
			int i = 1;  i++;
				File temp = driver.getScreenshotAs(OutputType.FILE);
				File dest = new File("./screenshots/snap"+i+".png");
				//FileUtils.copyDirectory(temp, dest);
				FileUtils.copyFile(temp, dest);
			//System.out.println("The snapshot of the current  browser is taken successfully");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			System.out.println("the current browser is closed");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("the current browser is not closed due to unknown error");
		}finally {
			takeSnap();
		}
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			System.out.println("the all browser are closed");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("the all browser are not closed due to unknown error");
		}finally {
			takeSnap();
		}
	}


	public void selectIndexByXpath(String xpath, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement text =  driver.findElementByXPath(xpath);
			Select sc =new Select(text);
			sc.selectByIndex(value);
			System.out.println("the value selected from dropdown "+xpath+" is "+value);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println("The element with the xpath"+xpath+"is not found in the DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath"+xpath+"is not visible in the application");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath"+xpath+"is disabled in the appication");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath"+xpath+"is not stable in the application");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath"+xpath+"is not interactable in the application");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("the element with xpath "+xpath+" is not interactable due to unexpected alert in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The drop down visible text"+value+"of the element with id"+xpath+"is not selected due to unknown error");
		}finally {
			takeSnap();
		}
	}

	public void selectVisibileTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement text =  driver.findElementByXPath(xpath);
			Select sc =new Select(text);
			sc.selectByVisibleText(value);
			System.out.println("the value selected from dropdown "+xpath+" is "+value);
		}  catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.err.println("The element with the xpath"+xpath+"is not found in the DOM");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath"+xpath+"is not visible in the application");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath"+xpath+"is disabled in the appication");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath"+xpath+"is not stable in the application");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with the xpath"+xpath+"is not interactable in the application");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("the element with xpath "+xpath+" is not interactable due to unexpected alert in the application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The drop down visible text"+value+"of the element with id"+xpath+"is not selected due to unknown error");
		}finally {
			takeSnap();
		}
	}

	public void pageDownByXpath(String xpath) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpath).sendKeys(Keys.PAGE_DOWN);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("the page not came down  due to unknown error");
		}finally {
			takeSnap();
		}
		
	}

	public void waitTime(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	

	

	

	

}
