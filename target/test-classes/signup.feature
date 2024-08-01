Feature: Sign Up and Login

  Scenario: Create a new account and login
  
    Given I am on the sign up page
    When I enter valid account details
    And I submit the sign up form
    Then I should see a confirmation message