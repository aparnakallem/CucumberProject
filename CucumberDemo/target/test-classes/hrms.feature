@LoginTest
Feature: Testing HRMS application
Scenario: Verify Login
Given Open HRMS application 
When Typing User name and Password
Then Login page should be shown and  Logout from the application
Then browser should be closed



