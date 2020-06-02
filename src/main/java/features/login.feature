Feature: Login into Application

Scenario Outline: Positive test validating login
Given I Navigate to "https://www.copart.fi/en/" site
And I login to the home page
When User enters <username> and <password> and logs in
Then verify that user is successfully logged in


Examples:
|username            |password     |
|akebolaji@gmail.com |wonderful86  |