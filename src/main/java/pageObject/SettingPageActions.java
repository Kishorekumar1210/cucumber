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

public class SettingPageActions extends BaseClass {
	

	WebDriver driver;

	PropertiesFileReader obj = new PropertiesFileReader();
	Properties data = obj.getProperty();

	public SettingPageActions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Settings']")
	WebElement Settings;

	@FindBy(css = "div:nth-child(2) > app-account-edit-name > pup-input > div > input")
	WebElement AccountName;

	@FindBy(css = "div > div.content-wrapper > div:nth-child(2) > div > pup-icon > div > svg")
	WebElement AccountToolTip;

	@FindBy(css = "div > div.content-wrapper > div:nth-child(3) > div > pup-icon > div > svg")
	WebElement CompanayToolTip;

	@FindBy(css = "div > div.content-wrapper > div:nth-child(4) > div > pup-icon > div > svg")
	WebElement FilterToolTip;

	@FindBy(css = "body > div")
	WebElement AccountToastMessage;

	@FindBy(css = "body > div.pup-tooltip.right.autohide.visible > div.tooltip-content.ng-star-inserted")
	WebElement CompanyToastMessage;

	@FindBy(css = "body > div.pup-tooltip.right.autohide.visible > div.tooltip-content.ng-star-inserted")
	WebElement FilterToastMessage;

	@FindBy(css = "form > pup-input:nth-child(n) > div.inner-input > input")
	List<WebElement> FooterLinks;

	@FindBy(css = "app-footer-links > app-footer-link-form > form > pup-button > button > span")
	WebElement AddLink;

	@FindBy(css = "#cdk-drop-list-0 > div:nth-child(1) > div")
	WebElement CreatedLink;

	@FindBy(xpath = "//*[text()='Edit']")
	WebElement EditLink;

	@FindBy(css = "input.ng-valid.ng-star-inserted.ng-touched.ng-dirty")
	WebElement EditLinkName;

	@FindBy(css = "#cdk-drop-list-0 > div > div > app-footer-link-form > form > pup-button > button > pup-icon > div > svg")
	WebElement EditTickMark;

	@FindBy(css = "#cdk-drop-list-0 > div:nth-child(n) > div > pup-icon.delete-button.icon.monochrome.ng-star-inserted > div > svg > path")
	List<WebElement> EditDeleteMark;

	@FindBy(css = "body > pup-toast-container > pup-toast-wrap > pup-icon-toast > div")
	WebElement DeleteToastMessage;

	@FindBy(css = "body > app-root > div > app-layout-footer > div > div > div > a:nth-child(n)")
	List<WebElement> FooterLinkBorder;

	@FindBy(css = "div:nth-child(4) > app-footer-links > div > div > div.scheme-content")
	WebElement Border;

	// Preference
	@FindBy(xpath = "//*[text()='Preferences']")
	WebElement Preference;

	@FindBy(css = "ng-component > div > div.content-wrapper > div > pup-icon > div > svg")
	WebElement PreferenceToolTip;

	@FindBy(css = "div > div.content-wrapper > pup-dropdown-select > pup-dropdown > div > pup-paragraph")
	WebElement PreferenceDropDown;

	@FindBy(css = "pup-dropdown-menu-item:nth-child(n) > span > span")
	List<WebElement> PreferenceLang;

	@FindBy(css = "body > pup-toast-container > pup-toast-wrap > pup-icon-toast > div")
	WebElement PreferenceToastMessage;

	@FindBy(css = "body > div")
	WebElement PreferenceDefaultToolTip;

	// Catalogs
	@FindBy(xpath = "//*[text()=' Catalogs ']")
	WebElement Catalog;

	@FindBy(css = "div.content-wrapper > app-account-edit-catalogs > div > pup-button > button > span")
	WebElement AddCatalog;

	@FindBy(css = "pup-input.default.icon-left.input.text > div > input")
	WebElement AddCatalogName;

	@FindBy(css = "pup-input.description-input.default.icon-left.input.textarea.resizable > div > textarea")
	WebElement AddCatalogDescription;

	@FindBy(css = "pup-wizard-footer > pup-button > button > span")
	WebElement AddCatalogSave;

	@FindBy(css = "pup-table-row:nth-child(3) > pup-table-cell:nth-child(2) > div > span")
	WebElement CatalogCreated;

	@FindBy(css = "div > pup-table-row:nth-child(10) > pup-table-cell:nth-child(3) > div > pup-dropdown-button > pup-dropdown > div > pup-icon > div > svg")
	WebElement CatalogThreeDots;

	@FindBy(css = "div > pup-dropdown-menu-item:nth-child(n) > span")
	List<WebElement> EditAndDelete;

	@FindBy(css = "body > pup-confirm-modal > pup-modal > div > div.buttons > pup-button.button.danger.large > button")
	WebElement DeleteCatalog;

	// Click on created catalog
	@FindBy(css = "div > div > pup-list:nth-child(2) > pup-list-item > div > h5")
	WebElement MemberHeading;

	@FindBy(css = "ng-component > div > div > pup-list:nth-child(4) > pup-list-item:nth-child(n) > div > h5")
	List<WebElement> CatalogHeading;

	@FindBy(css = "div > div > pup-list:nth-child(2) > pup-list-item > div > span")
	WebElement MemberText;

	@FindBy(css = "div > div > pup-list:nth-child(4) > pup-list-item:nth-child(n) > div > span")
	List<WebElement> CatalogText;

	@FindBy(xpath = "//*[text()='Attribute Groups']")
	WebElement AttributeGroup;
	
	@FindBy(css = "pup-wizard-content > div > div > div.public > pup-toggle:nth-child(n) > label > div")
	List<WebElement> PrivatePublicCatalog;
	
	@FindBy(css = "pup-table-row:nth-child(10) > pup-table-cell:nth-child(2) > div")
	WebElement publicCatalog;
	
	@FindBy(css = "body > app-root > app-layout-header > pup-button:nth-child(5) > button > span")
	WebElement Logout;
		

	// Member
	@FindBy(css = "ng-component > div > pup-placeholder > pup-heading")
	WebElement MemeberEmptyText;

	@FindBy(css = "ng-component > div > pup-placeholder > pup-paragraph")
	WebElement MemeberEmptyAddingText;

	@FindBy(css = "ng-component > div > div > pup-button > button > span")
	WebElement AddMembers;

	@FindBy(css = "div.input-wrapper.ng-star-inserted > app-multi-input > pup-input > div > input")
	WebElement AddMembersName;

	@FindBy(css = "div > div > pup-dropdown-menu-item > span > div > span")
	WebElement valueAddMembersName;

	@FindBy(css = "pup-button.cancel-button.button.cancel.large.ng-star-inserted > button > span")
	WebElement AddMembersCancel;

	// Filter Category
	@FindBy(css = "div.d-flex.justify-content-between.category-header > div > pup-button > button > span")
	WebElement AddFilter;

	@FindBy(css = "pup-content > div > div.row.h-100 > div > pup-placeholder > pup-heading")
	WebElement FilterEmpty;

	@FindBy(css = "ng-component > pup-content > div > div.row.h-100 > div > pup-placeholder > pup-paragraph")
	WebElement FilterCatalogText;

	@FindBy(css = "div:nth-child(1) > div.available-items > app-list-selection-item:nth-child(n) > span")
	List<WebElement> AttributeValues;

	@FindBy(css = "pup-wizard > pup-wizard-footer > pup-button > button > span")
	WebElement AttributeSave;

	@FindBy(css = "div > pup-table-row:nth-child(1) > pup-table-cell:nth-child(3) > div > pup-dropdown-button > pup-dropdown > div > pup-icon > div > svg")
	WebElement FilterThreeDots;

	@FindBy(css = "div > div.buttons > pup-button.button.large.primary > button")
	WebElement FilterDelete;

	@FindBy(css = "div > app-category:nth-child(2) > h3 > span")
	WebElement FilteredValues;

	// Search Values
	@FindBy(css = "pup-table-row:nth-child(1) > pup-table-cell:nth-child(3) > div > pup-icon > div > svg")
	WebElement DeleteSearchValues;

	// Attribute Groups
	@FindBy(css = "pup-content > div > div.category-header > div > pup-button > button > span")
	WebElement AddAttributeGroup;

	@FindBy(css = "pup-wizard > pup-wizard-content > div > pup-input > div > input")
	WebElement AttributeGroupName;

	@FindBy(css = "pup-wizard > pup-wizard-footer > pup-button > button > span")
	WebElement AttributeGroupContinue;

	@FindBy(css = "pup-breadcrumbs > pup-icon.home.icon.monochrome.ng-star-inserted > div > svg")
	WebElement HomeButton;

	@FindBy(css = "h2:nth-child(1)")
	WebElement AttributeSetValues;

	public void settings() throws Exception {
		try {
			Settings.click();
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}

	}

	public void accountName() throws Exception {
		try {
			AccountName.isDisplayed();
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}

	}

	public void accountToolTip() throws Exception {
		try {
			performMouseHover(AccountToolTip);
			Thread.sleep(2000);
			assertEquals(TextValidation.accountToolTip, AccountToastMessage.getText().trim());
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void companyToolTip() throws Exception {
		try {
			performMouseHover(CompanayToolTip);
			Thread.sleep(2000);
			String actual = CompanyToastMessage.getText().trim();
			System.out.println(actual);
			assertEquals(TextValidation.CompanyToolTip, CompanyToastMessage.getText().trim());
			Thread.sleep(3000);

		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void filterToolTip() throws Exception {
		try {
			Thread.sleep(2000);
			performMouseHover(FilterToolTip);
			Thread.sleep(2000);
			assertEquals(TextValidation.FilterToolTip, FilterToastMessage.getText().trim());
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void footerLinks() throws Exception {
		try {
			Thread.sleep(3000);
			FooterLinks.get(0).sendKeys(data.getProperty("FooterLink"));
			FooterLinks.get(1).sendKeys(data.getProperty("FooterURL"));
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}

	}

	public void addLinks() throws Exception {
		try {
			AddLink.click();
			Thread.sleep(5000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}

	}

	public void mouseOverlink() throws Exception {
		try {
			scrollIntoView(Border);
			Thread.sleep(5000);
			performMouseHover(CreatedLink);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}

	}

	public void editLink() throws Exception {
		try {
			EditLink.click();
			EditLinkName.clear();
			EditLinkName.sendKeys(data.getProperty("EditLink"));
			EditTickMark.click();
			EditDeleteMark.get(0).click();
			Thread.sleep(2000);
			assertEquals(TextValidation.EditLinkText, DeleteToastMessage.getText().trim());
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}

	}

	public void borderLink() throws Exception {
		try {
			FooterLinkBorder.get(0).isDisplayed();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void preference() throws Exception {
		try {
			Preference.click();
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void defaultToolTip() throws Exception {
		try {
			performMouseHover(PreferenceToolTip);
			Thread.sleep(2000);
			assertEquals(TextValidation.defaultToolTip, PreferenceDefaultToolTip.getText().trim());
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void preferenceLanguage() throws Exception {
		try {
			int n = 3;
			for (int i = 0; i < n; i++) {
				Thread.sleep(3000);
				PreferenceDropDown.click();
				Thread.sleep(2000);
				PreferenceLang.get(i).click();
				Thread.sleep(1000);
				assertEquals(TextValidation.preferenceLanguage, PreferenceToastMessage.getText().trim());
			}
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	// Catalog
	public void catalog() throws Exception {
		try {
			Thread.sleep(2000);
			Catalog.click();
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void addCatalog() throws Exception {
		try {
			Thread.sleep(2000);
			AddCatalog.click();
			AddCatalogName.sendKeys(data.getProperty("AddCatalog"));
			AddCatalogDescription.sendKeys(data.getProperty("AddCatalogDescription"));
			AddCatalogSave.click();
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void editCatalog() throws Exception {
		try {
			CatalogThreeDots.click();
			EditAndDelete.get(0).click();
			AddCatalogDescription.sendKeys(data.getProperty("EditCatalog"));
			AddCatalogSave.click();
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}
	
	public void togglePublicPrivate() throws Exception {
		try {
			CatalogThreeDots.click();
			EditAndDelete.get(0).click();
			PrivatePublicCatalog.get(0).click();
			PrivatePublicCatalog.get(1).click();
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}
	
	public void publicCatalog() throws Exception {
		try {
			PrivatePublicCatalog.get(1).click();
			AddCatalogSave.click();
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}
	
	public void publicCatalogCreated() throws Exception {
		try {
			Thread.sleep(2000);
			publicCatalog.click();
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}
	
	public void verifyPublicCatalog() throws Exception {
		try {
			String currentPage = driver.getCurrentUrl();
			Logout.click();
			Thread.sleep(3000);
			driver.get(currentPage);
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void deleteCatalog() throws Exception {
		try {
			Thread.sleep(2000);
			CatalogThreeDots.click();
			EditAndDelete.get(1).click();
			DeleteCatalog.click();
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void createdCatalog() throws Exception {
		try {
			CatalogCreated.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void catalogTextValidation() throws Exception {
		try {
			String member = MemberHeading.getText();
			String filter = CatalogHeading.get(0).getText();
			String searchValues = CatalogHeading.get(1).getText();
			String assets = CatalogHeading.get(2).getText();
			String attributeGroups = CatalogHeading.get(3).getText();
			String membertext = MemberText.getText();
			String filtertext = CatalogText.get(0).getText();
			String searchValuestext = CatalogText.get(1).getText();
			String assetstext = CatalogText.get(2).getText();
			String attributeGroupstext = CatalogText.get(3).getText();

			assertEquals(TextValidation.MemeberText, member);
			assertEquals(TextValidation.FilterText, filter);
			assertEquals(TextValidation.SearchValuesText, searchValues);
			assertEquals(TextValidation.AssetsText, assets);
			assertEquals(TextValidation.AttributeGroupText, attributeGroups);
			assertEquals(TextValidation.MemeberCatalogText, membertext);
			assertEquals(TextValidation.FilterCatalogText, filtertext);
			assertEquals(TextValidation.SearchValuesCatalogText, searchValuestext);
			assertEquals(TextValidation.AssetsCatalogText, assetstext);
			assertEquals(TextValidation.AttributeGroupCatalogText, attributeGroupstext);

		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void catalogMember() throws Exception {
		try {
			MemberHeading.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void memberEmptyText() throws Exception {
		try {
			assertEquals(TextValidation.MemberEmptyText, MemeberEmptyText.getText().trim());
			assertEquals(TextValidation.MemeberadditionalText, MemeberEmptyAddingText.getText().trim());
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void addMember() throws Exception {
		try {
			AddMembers.click();
			Thread.sleep(2000);
			AddMembersName.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			// valueAddMembersName.click();
			// Thread.sleep(2000);
			AddMembersCancel.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	// Filters
	public void filter() throws Exception {
		try {
			CatalogHeading.get(0).click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void filterText() throws Exception {
		try {
			if (FilterEmpty.isDisplayed()) {
				assertEquals(TextValidation.FilterEmptyText, FilterEmpty.getText().trim());
				assertEquals(TextValidation.FilteradditionalText, FilterCatalogText.getText().trim());
			}
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void addFilter() throws Exception {
		try {
			AddFilter.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void selectAttributes() throws Exception {
		try {
			AttributeValues.get(0).click();
			AttributeValues.get(1).click();
			AttributeValues.get(2).click();
			AttributeSave.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void editFilter() throws Exception {
		try {
			FilterThreeDots.click();
			EditAndDelete.get(0).click();
			AddCatalogName.clear();
			AddCatalogName.sendKeys(data.getProperty("EditFilter"));
			AddCatalogSave.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void deleteFilter() throws Exception {
		try {
			FilterThreeDots.click();
			EditAndDelete.get(1).click();
			FilterDelete.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void filteredValues() throws Exception {
		try {
			FilteredValues.isDisplayed();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	// Search values
	public void searchValues() throws Exception {
		try {
			CatalogHeading.get(1).click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void searchText() throws Exception {

		try {
			if (FilterEmpty.isDisplayed()) {
				assertEquals(TextValidation.SerachEmptyText, FilterEmpty.getText().trim());
				assertEquals(TextValidation.SearchadditionalText, FilterCatalogText.getText().trim());
			}
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void addsearchValues() throws Exception {
		try {
			AddFilter.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void deleteSearchValues() throws Exception {
		try {
			DeleteSearchValues.click();
			FilterDelete.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	// Assets
	public void assets() throws Exception {
		try {
			CatalogHeading.get(2).click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void assetsText() throws Exception {

		try {
			if (FilterEmpty.isDisplayed()) {
				assertEquals(TextValidation.AssetEmptyText, FilterEmpty.getText().trim());
				assertEquals(TextValidation.AssetadditionalText, FilterCatalogText.getText().trim());
			}
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void addAssetsValues() throws Exception {
		try {
			AddFilter.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void deleteAssetsValues() throws Exception {
		try {
			DeleteSearchValues.click();
			FilterDelete.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void homebutton() throws Exception {
		try {
			Thread.sleep(2000);
			HomeButton.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void verifyAttributes() throws Exception {
		try {
			scrollIntoView(AttributeSetValues);
			AttributeSetValues.isDisplayed();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	// Attributes
	public void attributeGroups() throws Exception {
		try {
			scrollIntoView(AttributeGroup);
			CatalogHeading.get(3).click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void attributeGroupsText() throws Exception {

		try {
			if (FilterEmpty.isDisplayed()) {
				assertEquals(TextValidation.AttributeGroupEmptyText, FilterEmpty.getText().trim());
				assertEquals(TextValidation.AttributeGroupSearchadditionalText, FilterCatalogText.getText().trim());
			}
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void addAttributeGroups() throws Exception {
		try {
			AddAttributeGroup.click();
			AttributeGroupName.sendKeys(data.getProperty("AddAttribute"));
			AttributeGroupContinue.click();
			selectAttributes();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void renameAttributeGroups() throws Exception {
		try {
			FilterThreeDots.click();
			EditAndDelete.get(0).click();
			Thread.sleep(2000);
			AttributeGroupName.clear();
			AttributeGroupName.sendKeys(data.getProperty("AttributeName"));
			AddCatalogSave.click();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void editAttributeGroups() throws Exception {
		try {
			FilterThreeDots.click();
			Thread.sleep(1000);
			EditAndDelete.get(1).click();
			AttributeGroupName.clear();
			AttributeGroupName.sendKeys(data.getProperty("AttributeName"));
			AttributeGroupContinue.click();
			selectAttributes();
			Thread.sleep(2000);
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

	public void deleteAttributeGroups() throws Exception {
		try {
			FilterThreeDots.click();
			EditAndDelete.get(2).click();
			FilterDelete.click();
		} catch (NoSuchElementException e) {
			System.out.println(e);
			e.getMessage();
		}
	}

}
