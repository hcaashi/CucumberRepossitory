Feature: login into Salesforce

Background:Run the step before every scenario
Given User launch the salesforce application

Scenario: Login into Salesforce using valid username and password
When user enter username
Then user enter password
And click on Rememberme
Then click on login button

Scenario: Login into Salesforce using Invalid username and password
When user enter username
Then user enter password
Then click on login button