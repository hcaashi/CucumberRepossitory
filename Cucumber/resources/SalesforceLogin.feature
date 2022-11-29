Feature: login into Salesforce

Scenario: Login into Salesforce using valid username and password
Given User launch the salesforce application
Then user enter username
Then user enter password
And click on Rememberme
Then click on login button
