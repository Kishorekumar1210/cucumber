@Regression
Feature: Content portal User page

Background:
  Given open the content portal url
  When user provides valid username and valid password
  Then user click on login
  Then user click on account page
  Then user click on Settings page

Scenario: User Page Invite memeber
  Then click on Users
  Then click on Invite Memeber 
  Then Verify the fields in Invite memeber
  Then verify user able to toggle between user and Admin

@Smoke
Scenario: User Page Invite memeber with valid email id
  Then click on Users
  Then click on Invite Memeber 
  Then user provide valid email ID
  Then user send Invitation
  Then verify the Invited member in pending status
  Then user able to remove invitation 
  