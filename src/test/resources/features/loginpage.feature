@Regression

Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  @smoke

  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully

  @smoke @sanity
  Scenario: Verify the error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "prime123@gmail.com"
    And I enter password "abc123"
    And I click on login button
    Then I should not logged in with invalid credentials

   @smoke
  Scenario: Verify user should log in successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "prime123@gmail.com"
    And I enter password "Prime123"
    And I click on login button
    Then I verify the log out link is displayed


  @author_archie @smoke
  Scenario: Verify that user should log out successfully
    Given I am on homepage
    When I click on login link
    And I enter email "prime123@gmail.com"
    And I enter password "Prime123"
    And I click on login button
    And I click on log out link
    Then I verify the login in is displayed