Feature: Login to Web
  As an user, I can login to the website

  Scenario: Login with valid email and password
    Given User is on Home Page
    And User go to menu sign in
    When User enters <email> and <password>
    | email  																| password    |
    | student-automation1@mailinator.com		| 123456789   |
    And Click sign in button
    Then User can visit my account page 