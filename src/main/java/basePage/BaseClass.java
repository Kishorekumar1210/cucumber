package basePage;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		ChromeOptions chromeOptions = new ChromeOptions();
		String browserName = System.getProperty("browserName");
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(chromeOptions);
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager manager = WebDriverManager.edgedriver();
			manager.config().setEdgeDriverVersion("98.*");
			manager.setup();
			EdgeOptions options = new EdgeOptions();
			driver = new EdgeDriver(options);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager manager = WebDriverManager.firefoxdriver();
			//manager.config().setEdgeDriverVersion("97.0.1");
			manager.config().setFirefoxVersion("97.*");
			manager.setup();
			FirefoxOptions options = new FirefoxOptions();
			driver = new FirefoxDriver(options);
		} else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		return driver;
	}

	// Implicit Wait
	public void implicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	// Scroll Into View
	public void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", (element));
	}

	// Drop Down
	public void selectValueFromDropdown(WebElement element, String attribute) {
		Select select = new Select(element);
		select.selectByValue(attribute);
	}

	// Element to Disappear
	public boolean waitForElementToDisappear(long timeoutseconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutseconds);
		return wait.until(ExpectedConditions.invisibilityOfElementLocated(
				By.cssSelector("pup-split-button[class='run-status-button split-button']")));
	}

	// Invisible Element
	public boolean waitForInvisibilityOfElement(long timeoutseconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutseconds);
		return wait.until(ExpectedConditions.invisibilityOf(element));
	}

	// Element to be clickable
	public void waitForElementToBeClickable(long timeoutseconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutseconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	// Wait for visible
	public void waitForElementsToBeVisible(long timeoutseconds, List<WebElement> element) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutseconds);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}

	// Wait for text
	public void waitForTextToBe(long timeoutseconds, WebElement element, String text) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutseconds);
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}

	// Mouse over
	public void mouseHoverOnWebElement(WebElement element) {
		try {
			Thread.sleep(2000);
			String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
			((JavascriptExecutor) driver).executeScript(mouseOverScript, element);
			Thread.sleep(2000);
		} catch (StaleElementReferenceException e) {
		} catch (NoSuchElementException e) {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Click using JavaScript Executor
	public void clickUsingExecutor(WebElement element) throws Exception {
		try {
			if (element.isDisplayed()) {
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", element);
			}
		} catch (StaleElementReferenceException e) {
		} catch (NoSuchElementException e) {
		} catch (Exception e) {
		}
	}

	// Mouse Over
	public void performMouseHover(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	// Text clear
	public void clearTextField(WebElement element) {
		element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		element.sendKeys(Keys.DELETE);
	}

	// Time Stamp
	public void getCurrentTimestamp() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
	}

	// Take screenshots
	public static void takeSnapShot(WebDriver webdriver) throws Exception {

		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("/Users/kishorekumar/eclipse-workspace/ContentPortal/ContentPortalProject/screenshot/"
				+ timeStamp + ".png");
		FileUtils.copyFile(SrcFile, DestFile);
	}

}
