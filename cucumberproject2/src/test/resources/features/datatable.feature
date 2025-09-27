Feature: Test the login functionality of OrangeHRM

Scenario: Test the valid login using Datatable 
Given user is on loginpage
When user enters credientails using Datatable 
|admin|admin123|
And click on login button
Then user should land on home page
