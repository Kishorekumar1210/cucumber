@Regression
Feature: Content portal Home page

Background:
  Given open the content portal url
  When user provides valid username and valid password
  Then user click on login
  Then user click on account page

@Smoke @Test
Scenario: Validation of account level 
  Then verify the products is displayed
  Then click on Select all 
  Then Click on Export XLSX 
  Then Click on Download CSV
  Then verify the Export assets with text
  Then Verify the text 
  Then Click on text and verify the text
  Then Click on view Selected
  Then click on Home button
  Then Verify the serach for products

@Smoke
Scenario: Product details page  
  Then verify the products is displayed
  Then click on the one products
  Then click on print and cancel
  Then click on Export Assets and cancel
  Then click on Export to email
  Then Verify the success message
  Then Click on Download CSV


Scenario: Verify user able to select other catalogs
  Then Verify user able to select other catalogs

 
Scenario: Verify user able to select other Catalogs
  Then verify user able to select other accounts

 
Scenario: Verify Multi account functionality
  Then user click on filters
  

Scenario: Verify the pagination of products in home page
  Then verify the products is displayed
  Then click on Select all 
  Then Verify the text
  Then Verify the user able to see pagination
  Then user can select more products using pagination

    