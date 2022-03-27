@Regression
Feature: Content portal Setting page

Background:
  Given open the content portal url
  When user provides valid username and valid password
  Then user click on login
  Then user click on account page
  Then user click on Settings page

@Smoke
Scenario: Setting page Account level General
  Then user should able to change Account name
  Then user should verify tool tip of account name
  Then user should verify Company logo and tool tip
  Then user should verify footer link and tool tip
  Then user provide link name and link URL
  Then user click on Add link 
  Then verify link is created 
  Then user should able to edit and Delete link
  Then user should able to see in footer
  #Then user can create more links(Out of scope)
  #Then verify all links is displayed in footer


Scenario: Setting page Account level Preference
  Then user click on Preference 
  Then Verify default language tool tip
  Then Vefify user should able to select default langauges from drop down

@Smoke
Scenario: Setting page Catalogs - Add Edit and Delete Catalogs 
  When user click on Catalogs 
  Then user click on Add a catalog
  Then user able to edit catalog
  Then user able to delete a catalog
 

Scenario: Verify the Catalog text of Filter, search, assets and Attribute groups
  When user click on Catalogs 
  Then user click on created catalog
  Then user verify the text of catalog modules
 
 
Scenario: Validation of Memeber module
  When user click on Catalogs
  Then user click on created catalog
  Then user click on Memebers
  Then Verify the empty text of Memeber
  Then click on Add Memeber 

@Smoke
Scenario: Validation of Filter Catagories
  When user click on Catalogs
  Then user click on created catalog
  Then click on Filter Categories
  Then Verify the Filter text if empty 
  Then click on Add Filters categories
  Then Select Available attributes from left navigation to right 
  Then user able to rename Filter Categories
  Then user able to delete Filter Categories
  Then user click on home page
  Then user able to see effected attributes in home page


Scenario: Validation of Search values
  When user click on Catalogs
  Then user click on created catalog
  Then click on Serach values
  Then verify the text of search values
  Then click on Add Search values
  Then Select Available attributes from left navigation to right 
  Then user able to delete Search values


Scenario: Validation of Add Assets
  When user click on Catalogs
  Then user click on created catalog
  Then click on Assets
  Then verify the text of assets values
  Then click on Add Assets 
  Then Select Available attributes from left navigation to right
  Then user able to delete Assets 
 
@Smoke
Scenario: Validation of Attribute Groups
  When user click on Catalogs
  Then user click on created catalog
  Then click on Attribute group
  Then Verify the text of attribute Groups
  Then click on Add Attribute Groups 
  Then user able to rename group
  Then user able to Edit group
  Then user able to delete group
  Then user click on home page
  Then click on the one products
  Then user verify the Attribute group details in product details page


Scenario: Validation of Public and private catalog 
  When user click on Catalogs 
  Then user click on Add a catalog
  Then verify user able to toggle private and public catalog
  Then select Public catalog and save
  Then click on created public catalog
  Then verify user able to navigate to page without credentails
 