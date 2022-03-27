package stepDefinations;

import basePage.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePageActions;
import pageObject.SettingPageActions;

public class settingsPage extends BaseClass {

	SettingPageActions settingPageActions;

	@Then("user click on Settings page")
	public void user_click_on_Settings_page() throws Exception {
		settingPageActions = new SettingPageActions(driver);
		settingPageActions.settings();
	}

	@Then("user should able to change Account name")
	public void user_should_able_to_change_Account_name() throws Exception {
		settingPageActions.accountName();
	}

	@Then("user should verify tool tip of account name")
	public void user_should_verify_tool_tip_of_account_name() throws Exception {
		settingPageActions.accountToolTip();
	}

	@Then("user should verify Company logo and tool tip")
	public void user_should_verify_Company_logo_and_tool_tip() throws Exception {
		settingPageActions.companyToolTip();
	}

	@Then("user should verify footer link and tool tip")
	public void user_should_verify_footer_link_and_tool_tip() throws Exception {
		settingPageActions.filterToolTip();
	}

	@Then("user provide link name and link URL")
	public void user_provide_link_name_and_link_URL() throws Exception {
		settingPageActions.footerLinks();
	}

	@Then("user click on Add link")
	public void user_click_on_Add_link() throws Exception {
		settingPageActions.addLinks();
	}

	@Then("verify link is created")
	public void verify_link_is_created() throws Exception {
		settingPageActions.mouseOverlink();
	}

	@Then("user should able to edit and Delete link")
	public void user_should_able_to_edit_link() throws Exception {
		settingPageActions.editLink();
	}

	@Then("user should able to see in footer")
	public void user_should_able_to_see_in_footer() throws Exception {
		settingPageActions.borderLink();
	}

	@Then("user can create more links")
	public void user_can_create_more_links() throws Exception {

	}

	@Then("verify all links is displayed in footer")
	public void verify_all_links_is_displayed_in_footer() throws Exception {

	}

	// Preference
	@Then("user click on Preference")
	public void user_click_on_Preference() throws Exception {
		settingPageActions.preference();
	}

	@Then("Verify default language tool tip")
	public void verify_default_language_tool_tip() throws Exception {
		settingPageActions.defaultToolTip();
	}

	@Then("Vefify user should able to select default langauges from drop down")
	public void vefify_user_should_able_to_select_default_langauges_from_drop_down() throws Exception {
		settingPageActions.preferenceLanguage();
	}

	@When("user click on Catalogs")
	public void user_click_on_Catalogs() throws Exception {
		settingPageActions.catalog();
	}

	@Then("user click on Add a catalog")
	public void user_click_on_Add_a_catalog() throws Exception {
		settingPageActions.addCatalog();
	}

	@Then("user able to edit catalog")
	public void user_able_to_edit_catalog() throws Exception {
		settingPageActions.editCatalog();
	}
	
	@Then("verify user able to toggle private and public catalog")
	public void user_able_to_toggle_public() throws Exception {
		settingPageActions.togglePublicPrivate();
	}
	
	@Then("select Public catalog and save")
	public void select_Public_catalog() throws Exception {
		settingPageActions.publicCatalog();
	}
	
	@Then("click on created public catalog")
	public void created_public_catalog() throws Exception {
		settingPageActions.publicCatalogCreated();
	}
	
	@Then("verify user able to navigate to page without credentails")
	public void verify_user_able_to_naviage() throws Exception {
		settingPageActions.verifyPublicCatalog();
	}

	@Then("user able to delete a catalog")
	public void user_able_to_delete_a_catalog() throws Exception {
		settingPageActions.deleteCatalog();
	}

	@Then("user click on created catalog")
	public void user_click_on_created_catalog() throws Exception {
		settingPageActions.createdCatalog();
	}

	@Then("user verify the text of catalog modules")
	public void user_verify_the_text_of_catalog_modules() throws Exception {
		settingPageActions.catalogTextValidation();
	}

	@Then("user click on Memebers")
	public void user_click_on_Memebers() throws Exception {
		settingPageActions.catalogMember();
	}

	@Then("Verify the empty text of Memeber")
	public void verify_the_empty_text_of_Memeber() throws Exception {
		settingPageActions.memberEmptyText();
	}

	@Then("click on Add Memeber")
	public void click_on_Add_Memeber() throws Exception {
		settingPageActions.addMember();
	}

	@Then("click on Filter Categories")
	public void click_on_Filter_Categories() throws Exception {
		settingPageActions.filter();
	}

	@Then("Verify the Filter text if empty")
	public void verify_the_Filter_text_if_empty() throws Exception {
		settingPageActions.filterText();
	}

	@Then("click on Add Filters categories")
	public void click_on_Add_Filters_categories() throws Exception {
		settingPageActions.addFilter();
	}

	@Then("Select Available attributes from left navigation to right")
	public void select_Available_attributes_from_left_navigation_to_right() throws Exception {
		settingPageActions.selectAttributes();
	}

	@Then("user able to rename Filter Categories")
	public void user_able_to_rename_Filter_Categories() throws Exception {
		settingPageActions.editFilter();
	}

	@Then("user able to delete Filter Categories")
	public void user_able_to_delete_Filter_Categories() throws Exception {
		settingPageActions.deleteFilter();
	}

	@Then("user able to see effected attributes in home page")
	public void user_able_to_see_effected_attributes_in_home_page() throws Exception {
		settingPageActions.filteredValues();
	}

	// Search values
	@Then("click on Serach values")
	public void click_on_Serach_values() throws Exception {
		settingPageActions.searchValues();
	}

	@Then("verify the text of search values")
	public void click_on_Serach_text() throws Exception {
		settingPageActions.searchText();
	}

	@Then("click on Add Search values")
	public void click_on_Add_Search_values() throws Exception {
		settingPageActions.addsearchValues();
	}

	@Then("user able to delete Search values")
	public void user_able_to_delete_Search_values() throws Exception {
		settingPageActions.deleteSearchValues();
	}

	// Assets
	@Then("click on Assets")
	public void click_on_Assets() throws Exception {
		settingPageActions.assets();
	}

	@Then("verify the text of assets values")
	public void click_on_Assets_text() throws Exception {
		settingPageActions.assetsText();
	}

	@Then("click on Add Assets")
	public void click_on_Add_Assets() throws Exception {
		settingPageActions.addAssetsValues();
	}

	@Then("user able to delete Assets")
	public void user_able_to_delete_Assets() throws Exception {
		settingPageActions.deleteAssetsValues();
	}

	// Attributes
	@Then("click on Attribute group")
	public void click_on_Attribute_group() throws Exception {
		settingPageActions.attributeGroups();
	}

	@Then("Verify the text of attribute Groups")
	public void click_on_Attribute_Text() throws Exception {
		settingPageActions.attributeGroupsText();
	}

	@Then("click on Add Attribute Groups")
	public void click_on_Add_Attribute_Groups() throws Exception {
		settingPageActions.addAttributeGroups();
	}

	@Then("user able to rename group")
	public void user_able_to_rename_group() throws Exception {
		settingPageActions.renameAttributeGroups();
	}

	@Then("user able to Edit group")
	public void user_able_to_Edit_group() throws Exception {
		settingPageActions.editAttributeGroups();
	}

	@Then("user able to delete group")
	public void user_able_to_delete_group() throws Exception {
		settingPageActions.deleteAttributeGroups();
	}

	@Then("user click on home page")
	public void user_click_on_home_page() throws Exception {
		settingPageActions.homebutton();
	}

	@Then("user verify the Attribute group details in product details page")
	public void user_verify_the_Attribute_group_details_in_product_details_page() throws Exception {
		settingPageActions.verifyAttributes();
	}

}
