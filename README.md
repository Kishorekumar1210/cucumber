# Libraries Used:
Java Language - To automate scripts

TestNG - Unit Testing Library

Maven Cucumber Reports - Reporting Library to generate beautiful html reports

Cucumber Framework - BDD Approach

Note : All the aforementioned libraries are open-source and does not include any license.

# Required Software:
Java JDK 8+
Apache Maven
Cucumber and Natural Plug IN

# Capabilities:
This framework has the capability to run the tests in local and on remote servers using docker. Configurations can be changed from config.properties inside src/test/resources

# Running Tests:
Pre-requisites: Java 8+ , Maven 3.8.6 Installed and path set

# Steps to execute the tests scripts :
Prerequisite :
Click on the “Run Configuration” and under goals provide the below Mavan command.

Mavan command : clean test verify -DbrowserName=BrowserName -Dcucumber.filter.tags=”TagName"

Click on Apply and Click on Run.

# About the Project Structure:
Project create based on Cucumber Framework and it consists of three main components

Feature File - A Feature File is an entry point to the Cucumber tests. This is a file where you will describe your tests in Descriptive language (Like English). It is an essential part of Cucumber, as it serves as an automation test script as well as live documents.

Step Definition - When Cucumber executes a Gherkin step in a scenario, it will look for a matching step definition to execute.

Test Runner - TestRunner File is used to build a Communication between Feature Files and StepDefinition Files. features: We use Cucumber features option to define path of feature file(s).
