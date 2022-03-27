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

public class HomePageActions extends BaseClass {

	WebDriver driver;
	

	PropertiesFileReader obj = new PropertiesFileReader();
	Properties data = obj.getProperty();

	public HomePageActions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Settings']")
	WebElement Settings;

	@FindBy(xpath = "//*[text()='Log out']")
	WebElement Logout;

	@FindBy(xpath = "//*[text()='ENG']")
	WebElement Language;

	@FindBy(css = "button > app-checkbox > pup-icon > div > svg")
	WebElement SelectAll;

	@FindBy(xpath = "//*[text()='Export XLSX']")
	WebElement ExportXLSX;

	@FindBy(xpath = "//*[text()='Download CSV']")
	WebElement DownloadCSV;

	@FindBy(css = "pup-button.button.disabled.large.pagination > button > span")
	WebElement ExportAssets;

	@FindBy(xpath = "//*[text()='View selected']")
	WebElement ViewSelected;

	@FindBy(css = "app-account-dropdown > pup-dropdown-select > pup-dropdown > div")
	WebElement AccountDropDown;

	@FindBy(xpath = "//*[text()='Test Kishore']")
	WebElement Account;

	@FindBy(css = "app-product-card:nth-child(n) > a > div.image-container")
	List<WebElement> products;

	@FindBy(css = "div.all-selected-message.ng-star-inserted > pup-button > button")
	WebElement textMessage;

	@FindBy(css = "pup-breadcrumbs > pup-icon.home.icon.monochrome.ng-star-inserted > div > svg")
	WebElement HomeButton;

	@FindBy(css = "app-product-search > pup-input > div > input")
	WebElement SearchProducts;

	@FindBy(css = "pup-button.print-action.button.large.secondary > button > span")
	WebElement PrintProducts;

	@FindBy(css = "div > cr-button.cancel-button")
	WebElement PrintCancel;

	@FindBy(xpath = "//*[text()='Export Assets']")
	WebElement ExportProducts;

	@FindBy(css = "div.buttons > pup-button.button.cancel.small > button")
	WebElement ExportProductsCancel;

	@FindBy(css = "pup-button.export-button.button.primary.small > button")
	WebElement ExportProductsEmail;

	@FindBy(css = "app-product-search > pup-input > div > input")
	WebElement SuccessMessage;

	@FindBy(css = "app-catalog-selector > pup-dropdown-select > pup-dropdown > div > pup-icon > div > svg")
	WebElement CatalogDropDown;

	@FindBy(css = "app-account-dropdown > pup-dropdown-select > pup-dropdown > div > pup-icon > div > svg > path")
	WebElement MultiAccountDropDown;

	@FindBy(css = "div > pup-dropdown-menu-item:nth-child(n) > span")
	List<WebElement> catalogs;

	@FindBy(css = "pup-dropdown-menu-item:nth-child(n) > span > app-account-logo > span")
	List<WebElement> MultiAccount;

	@FindBy(css = "div > div:nth-child(n) > span.item-value")
	List<WebElement> Filters;

	@FindBy(css = "div > div > pup-button > button > pup-icon > div > svg")
	WebElement FiltersCancel;
	
	@FindBy(css = "div > div > div.toast-heading.message.ng-star-inserted")
	WebElement SuccessExport;
	
	@FindBy(css = "div > div > div.toast-message.message.ng-star-inserted")
	WebElement ExportSucess;
	
	@FindBy(css = "pup-pagination > pup-dropdown-select > pup-dropdown > div > pup-paragraph")
	WebElement pagination;
	
	@FindBy(css = "div > pup-dropdown-menu-item:nth-child(n) > span")
	List<WebElement> paginationNumber;
	

	public void setting() throws Exception {

		try {
			Settings.click();
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void viewAccountDropDown() throws Exception {
		try {
			AccountDropDown.click();
			Thread.sleep(2000);
			scrollIntoView(Account);
			Account.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}

	}

	public void products() throws Exception {

		try {
			products.get(0).isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void selectAll() throws Exception {

		try {
			SelectAll.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}
	
	public void pagination() throws Exception {
		try {
			Thread.sleep(2000);
			scrollIntoView(pagination);
			Thread.sleep(2000);
			pagination.click();
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}
	
	public void paginationProducts() throws Exception {
		try {
			Thread.sleep(1000);
			paginationNumber.get(2).click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void exportXLSX() throws Exception {

		try {
			ExportXLSX.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void downloadCSV() throws Exception {

		try {
			DownloadCSV.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void exportAssets() throws Exception {

		try {
			performMouseHover(ExportAssets);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void verifytabTex() throws Exception {

		try {
			performMouseHover(DownloadCSV);
			Thread.sleep(2000);
			textMessage.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void viewSelected() throws Exception {

		try {
			ViewSelected.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void homeButton() throws Exception {

		try {
			Thread.sleep(2000);
			HomeButton.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void searchProducts() throws Exception {

		try {
			SearchProducts.sendKeys(data.getProperty("SearchProduct"));
			Thread.sleep(3000);
			SearchProducts.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			products();
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void oneProduct() throws Exception {

		try {
			products.get(0).click();
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void printProduct() throws Exception {

		try {
			PrintProducts.isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void exportproductCancel() throws Exception {

		try {
			Thread.sleep(4000);
			ExportProducts.click();
			ExportProductsCancel.click();
			Thread.sleep(4000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void exportproductEmail() throws Exception {

		try {
			driver.navigate().refresh();
			Thread.sleep(4000);
			ExportProducts.click();
			ExportProductsEmail.click();
			Thread.sleep(4000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void successMessage() throws Exception {
		try {
			assertEquals(TextValidation.headingText, SuccessExport.getText().trim());
			assertEquals(TextValidation.successText, ExportSucess.getText().trim());
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void otherCatalog() throws Exception {

		try {
			int n = 4;
			for (int i = 0; i < n; i++) {
				Thread.sleep(3000);
				CatalogDropDown.click();
				Thread.sleep(3000);
				catalogs.get(i).click();
				products();
			}
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void multiAccount() throws Exception {
		try {
			int n = 5;
			for (int i = 0; i < n; i++) {
				Thread.sleep(2000);
				MultiAccountDropDown.click();
				Thread.sleep(2000);
				MultiAccount.get(i).click();
				Thread.sleep(3000);
				products();
			}
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void filters() throws Exception {
		try {
			int n = 5;
			for (int i = 0; i < n; i++) {
				Thread.sleep(2000);
				Filters.get(i).click();
				Thread.sleep(3000);
				products();
				FiltersCancel.click();
			}
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

}
