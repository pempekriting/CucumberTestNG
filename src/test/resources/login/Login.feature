Feature: Login to Web

  As an user, I can login to the website

  Background:
    Given User is on login page

  Scenario: Login with valid username and password
    When User provide valid username and password
    Then User directed to the products page

  Scenario: Login with invalid username and password
    When User provide invalid username and password
    Then Notification error Username and password do not match any user in this service is displayed

  Scenario: Login with invalid username and valid password
    When User provide invalid username
    Then Notification error Username and password do not match any user in this service is displayed

  Scenario: Login with valid username and invalid password
    When User provide invalid password
    Then Notification error Username and password do not match any user in this service is displayed

  Scenario: Login without username and password
    When User not provide the data for login
    Then Notification error Username is required is displayed

  Scenario: Login without username and with password
    When User provide password only
    Then Notification error Username is required is displayed

  Scenario: Login with username and without password
    When User provide username only
    Then Notification error Password is required is displayed