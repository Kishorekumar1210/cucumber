package pageObject;

//import static org.testng.Assert.assertEquals;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


import java.util.Base64;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basePage.BaseClass;
import basePage.PropertiesFileReader;
import basePage.TextValidation;

public class LoginPageActions extends BaseClass {

	WebDriver driver;

	PropertiesFileReader obj = new PropertiesFileReader();
	Properties data = obj.getProperty();

	public LoginPageActions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@type='text']")
	WebElement UserName;

	@FindBy(xpath = "//*[@type='password']")
	WebElement Password;

	@FindBy(xpath = "//*[text()=' Log in ']")
	WebElement Login;

	@FindBy(xpath = "//*[text()='Settings']")
	WebElement SettingHomePage;

	@FindBy(css = "body > pup-toast-container > pup-toast-wrap > pup-simple-message-toast > div > div > div")
	WebElement loginToastMessage;

	@FindBy(css = "div.login-content > div > div > form > pup-paragraph")
	WebElement LoginText;

	@FindBy(css = "div > div > form > app-dropdown-language-select > pup-dropdown-select > pup-dropdown > div")
	WebElement LoginLanguage;

	@FindBy(css = "pup-dropdown-menu-item:nth-child(n) > span > span")
	List<WebElement> AllLanguage;

	// Go the Content portal
	public void gotoURL() throws Exception {
		try {
			getAppUrl();
		} catch (Exception e) {
			throw new NoSuchElementException("Webpage is not working");
		}
	}

	// UserName and Password
	public void userNameAndPassword() throws Exception {

		try {
			driver.navigate().refresh();
			clickObject(UserName);
			UserName.sendKeys(data.getProperty("UserName"));
			clickObject(Password);
			String decodedPassword = decodePassword();
			Password.sendKeys(decodedPassword);
			implicitWait(5);
		} catch (NoSuchElementException e) {
			takeSnapShot(driver);
			throw new NoSuchElementException("UserName and Password is not entered");
		}
	}

	// Click on the Element
	public void clickObject(WebElement element) throws Exception {
		if (element.isDisplayed()) {
			element.click();
		} else {
			throw new NoSuchElementException("Element is not displayed");
		}
	}

	public void submit() throws Exception {

		try {
			clickObject(Login);
			Thread.sleep(5000);
		} catch (NoSuchElementException e) {
			takeSnapShot(driver);
			throw new NoSuchElementException("Sumbit button is not displayed");
		}
	}

	public void getPageTitleHomePage() throws Exception {
		try {
			SettingHomePage.isDisplayed();
		} catch (NoSuchElementException e) {
			takeSnapShot(driver);
			throw new NoSuchElementException("Home Page title is not displayed");
		}
	}

	public void getFailedMessage() throws Exception {
		try {
			assertEquals(TextValidation.failedLoginText, loginToastMessage.getText().trim());
		} catch (NoSuchElementException e) {
			takeSnapShot(driver);
			throw new NoSuchElementException("Error message is displayed");
		}
	}

	public void getLoginText() throws Exception {
		try {
			assertEquals(TextValidation.loginText, LoginText.getText().trim());
		} catch (NoSuchElementException e) {
			takeSnapShot(driver);
			throw new NoSuchElementException("Error message is displayed" + e);
		}
	}

	public void language() throws Exception {
		try {
			Thread.sleep(3000);
			clickUsingExecutor(LoginLanguage);
			Thread.sleep(3000);
			AllLanguage.get(0).click();
		} catch (NoSuchElementException e) {
			takeSnapShot(driver);
			System.out.println("Element not displayed" + e);
		}
	}

	public void inValiduserNameAndPassword() throws Exception {

		try {
			UserName.sendKeys(data.getProperty("InvalidUserName"));
			Password.sendKeys(data.getProperty("InvalidPassword"));
		} catch (NoSuchElementException e) {
			takeSnapShot(driver);
			throw new NoSuchElementException("UserName and Password is not working");
		}
	}

	// Decode Password
	public String decodePassword() {
		return new String(Base64.getDecoder().decode(data.getProperty("Password").getBytes()));
	}

	// Go to Site
	public void getAppUrl() {
		driver.get(data.getProperty("BaseURI"));
		implicitWait(5);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

}
