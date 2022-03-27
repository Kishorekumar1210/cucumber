package pageObject;

//import static org.testng.Assert.assertEquals;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePage.BaseClass;
import basePage.PropertiesFileReader;
import basePage.TextValidation;

public class UserPageActions extends BaseClass {

	WebDriver driver;

	PropertiesFileReader obj = new PropertiesFileReader();
	Properties data = obj.getProperty();

	public UserPageActions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()=' Users ']")
	WebElement Users;

	@FindBy(css = "div.content-wrapper > app-account-user-list > div > div > pup-button > button > span")
	WebElement InviteMember;

	@FindBy(css = "div.emails-wrapper > div.label")
	WebElement InviteEmailText;

	@FindBy(css = "div > div > div.label.label-role")
	WebElement InviteRoleText;

	@FindBy(css = "div > div.invite-catalog-heading > span")
	WebElement InviteCatalogText;

	@FindBy(css = "pup-wizard-content > div > div > app-dropdown-role-select > pup-dropdown-select > pup-dropdown > div > pup-icon > div > svg")
	WebElement InviteDropDown;

	@FindBy(css = "div > pup-dropdown-menu-item:nth-child(n) > span > span")
	List<WebElement> Roles;

	@FindBy(css = "div > div > div.emails-wrapper > app-multi-input > pup-input > div > input")
	WebElement InviteMemberEmail;

	@FindBy(css = "pup-button.finish-button.button.large.primary.ng-star-inserted > button > span")
	WebElement SendInvitation;

	@FindBy(xpath = "//*[text()='kishorejaknalli123@outlook.com']")
	WebElement InvitedEmail;

	@FindBy(xpath = "(//*[text()='invite pending '])[1]")
	WebElement InvitePending;

	@FindBy(xpath = "//*[text()='Remove']")
	WebElement InviteRemove;

	@FindBy(xpath = "//*[text()=' Confirm ']")
	WebElement InviteConfirm;

	public void users() throws Exception {
		try {
			Users.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void inviteMember() throws Exception {
		try {
			InviteMember.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void memberTextValidation() throws Exception {
		try {
			assertEquals(TextValidation.UseremailText, InviteEmailText.getText().trim());
			assertEquals(TextValidation.UserRoleText, InviteRoleText.getText().trim());
			assertEquals(TextValidation.UserCatalogText, InviteCatalogText.getText().trim());
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void toggleRoles() throws Exception {
		try {
			InviteDropDown.click();
			Roles.get(0).click();
			Thread.sleep(2000);
			InviteDropDown.click();
			Roles.get(1).click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void inviteEmailAddress() throws Exception {
		try {
			InviteMemberEmail.sendKeys(data.getProperty("InviteEmail"));
			InviteMemberEmail.sendKeys(Keys.ENTER);
			InviteDropDown.click();
			Roles.get(0).click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void sendInvitation() throws Exception {
		try {
			SendInvitation.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void invitedEmail() throws Exception {
		try {
			scrollIntoView(InvitedEmail);
			InvitePending.isDisplayed();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void removeinvitedEmail() throws Exception {
		try {
			performMouseHover(InvitePending);
			InviteRemove.click();
			InviteConfirm.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

}
