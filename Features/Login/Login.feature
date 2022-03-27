@Regression @Smoke
Feature: Content portal login page

Scenario: Content portal login page with valid email ID and password
  Given open the content portal url
  When user provides valid username and valid password
  Then user click on login
  Then user can see the content portal page with title

Scenario: Content portal login page with Invalid email ID and password
  Given open the content portal url
  When user provides Invalid username and Invalid password
  Then user click on login
  Then verify the failed message
  
Scenario: Login page text validation
  Given open the content portal url
  Then Verify text validation