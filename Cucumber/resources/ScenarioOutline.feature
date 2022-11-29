Feature: login into Salesforce

Scenario Outline: Login into Salesforce using valid username and password
Given User launch the salesforce application
Then user enter username "<Username>"
And user enter password "<Password>"
Then click on login button 

Examples: 
|Username|Password|
|jnanesh.m@tekarch.com|Test@123|
|jnanesh.m1@tekarch.com|Test@123|
