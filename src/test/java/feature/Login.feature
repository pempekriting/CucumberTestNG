Feature: Login to Web
  As an user, I can login to the website

  Scenario: Login with valid email and password
    Given User is on Home Page
    And User go to menu sign in
    When User enters <email> and <password>
    | email  									| password    |
    | student-automation1@mailinator.com		| 123456789   |
    And Click sign in button
    Then User can visit my account page
    
    Scenario: Login with invalid email and password
    Given User is on Home Page
    And User go to menu sign in
    When User enters <email> and <password>
    | email  									| password     |
    | student-automation111@mailinator.com		| 1234567892   |
    And Click sign in button
    Then Notification error authentication failed is displayed
    
    Scenario: Login with invalid email and valid password
    Given User is on Home Page
    And User go to menu sign in
    When User enters <email> and <password>
    | email  									| password     |
    | student-automation111@mailinator.com		| 123456789    |
    And Click sign in button
    Then Notification error authentication failed is displayed
    
    Scenario: Login with valid email and invalid password
    Given User is on Home Page
    And User go to menu sign in
    When User enters <email> and <password>
    | email  									  | password     |
    | student-automation1@mailinator.com		  | 1234567892   |
    And Click sign in button
    Then Notification error authentication failed is displayed
    
    Scenario: Login without email and password
    Given User is on Home Page
    And User go to menu sign in
    And Click sign in button
    Then Notification error email address required is displayed
    
    Scenario: Login without email and with password
    Given User is on Home Page
    And User go to menu sign in
    When User enter <password>
    | password     |
    | 123456789    |
    And Click sign in button
    Then Notification error email address required is displayed


    Scenario: Login with email and without password
    Given User is on Home Page
    And User go to menu sign in
    When User enter <email>
    | email  									  |
    | student-automation1@mailinator.com		  |
    And Click sign in button
    Then Notification error password required is displayed