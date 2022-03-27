package stepDefinations;

import basePage.BaseClass;

import io.cucumber.java.en.Then;
import pageObject.HomePageActions;

public class HomePage extends BaseClass {

	HomePageActions homePageActions;

	@Then("user click on account page")
	public void user_click_on_Settings_page() throws Exception {
		homePageActions = new HomePageActions(driver);
		homePageActions.viewAccountDropDown();
	}

	@Then("verify the products is displayed")
	public void verify_the_products_is_displayed() throws Exception {
		homePageActions.products();
	}

	@Then("click on Select all")
	public void click_on_Select_all() throws Exception {
		homePageActions.selectAll();
	}
	
	@Then("Verify the user able to see pagination")
	public void Verify_the_user_able_to_see_pagination() throws Exception {
		homePageActions.pagination();
	}
	
	@Then("user can select more products using pagination")
	public void user_can_select_more() throws Exception {
		homePageActions.paginationProducts();
	}

	@Then("Click on Export XLSX")
	public void click_on_Export_XLSX() throws Exception {
		homePageActions.exportXLSX();
	}

	@Then("Click on Download CSV")
	public void click_on_Download_CSV() throws Exception {
		homePageActions.downloadCSV();
	}

	@Then("verify the Export assets with text")
	public void verify_the_Export_assets_with_text() throws Exception {
		homePageActions.exportAssets();
	}

	@Then("Verify the text")
	public void verify_the_text() throws Exception {
		homePageActions.verifytabTex();
	}

	@Then("Click on text and verify the text")
	public void click_on_text_and_verify_the_text() throws Exception {
		// homePageActions.products();
	}

	@Then("Click on view Selected")
	public void click_on_view_Selected() throws Exception {
		homePageActions.viewSelected();
	}

	@Then("click on Home button")
	public void click_on_Home_button() throws Exception {
		homePageActions.homeButton();
	}

	@Then("Verify the serach for products")
	public void click_on_Serach_Products() throws Exception {
		homePageActions.searchProducts();
	}

	@Then("click on the one products")
	public void click_on_the_one_products() throws Exception {
		homePageActions.oneProduct();
	}

	@Then("click on print and cancel")
	public void click_on_print_and_cancel() throws Exception {
		homePageActions.printProduct();
	}

	@Then("click on Export Assets and cancel")
	public void click_on_Export_Assets_and_cancel() throws Exception {
		homePageActions.exportproductCancel();
	}

	@Then("click on Export to email")
	public void click_on_Export_to_email() throws Exception {
		homePageActions.exportproductEmail();
	}

	@Then("Verify the success message")
	public void verify_the_success_message() throws Exception {
		homePageActions.successMessage();
	}

	@Then("Verify user able to select other catalogs")
	public void verify_user_able_to_select_other_catalogs() throws Exception {
		homePageActions.otherCatalog();
	}

	@Then("verify user able to select other accounts")
	public void verify_user_able_to_select_other_accounts() throws Exception {
		homePageActions.multiAccount();
	}

	@Then("user click on filters")
	public void verify_user_able_click_Filter() throws Exception {
		homePageActions.filters();
	}

}
