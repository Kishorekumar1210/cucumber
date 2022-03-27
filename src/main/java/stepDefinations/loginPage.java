package stepDefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import basePage.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPageActions;

public class loginPage {

	WebDriver driver;
	LoginPageActions login;
	Scenario scenario;

	@Given("open the content portal url")
	public void open_the_content_portal_url() throws Exception {

		driver = BaseClass.getDriver();
		driver.manage().window().maximize();
		login = new LoginPageActions(driver);
		login.getAppUrl();
	}

	@After
	public void teardown(Scenario scenario) {
		this.scenario = scenario;
		if (scenario.isFailed()) {
			TakesScreenshot scrshot = (TakesScreenshot) driver;
			byte[] data = scrshot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(data, "image/png", "ContentPortal");
		}
		driver.close();
	}

	@When("user provides valid username and valid password")
	public void user_provides_valid_username_and_valid_password() throws Exception {
		login.userNameAndPassword();
	}

	@Then("user click on login")
	public void user_click_on_login() throws Exception {
		login.submit();
	}

	@Then("user can see the content portal page with title")
	public void user_can_see_the_content_portal_page_with_title() throws Exception {
		login.getPageTitleHomePage();
	}

	@When("user provides Invalid username and Invalid password")
	public void user_provides_Invalid_username_and_Invalid_password() throws Exception {
		login.inValiduserNameAndPassword();
	}

	@Then("verify the failed message")
	public void verify_user_cannot_able_to_login() throws Exception {
		login.getFailedMessage();
	}

	@Then("Verify text validation")
	public void verify_text_Validation() throws Exception {
		login.getLoginText();
	}

	@Then("Verify user able to change the language")
	public void verify_user_able_to_Change_Language() throws Exception {
		login.language();
	}

}
