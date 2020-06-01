Feature: Login into Application

Scenario Outline: Positive test validating login
Given Intialize the browser with chrome
And Navigate to "https://www.copart.fi/en/" site
And click on Login link in home page to land on secure sign in page
When User enters <username> and <password> and logs in
Then verify that user is successfully logged in
And close browser

Examples:
|username            |password     |
|akebolaji@gmail.com |wonderful86  |