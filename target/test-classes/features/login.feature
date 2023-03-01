
@wip
Feature: Login feature

  Scenario: Test Case 2: Login User with correct email and password
    Given Navigate to url
    When Verify that home page is visible successfully
    And Click SignInLogin button
    And Verify Login to your account is visible
    And Enter correct email address and password
    And Click login button
    And Verify that Logged in as username is visible
