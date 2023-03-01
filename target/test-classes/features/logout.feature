

Feature: Log out feature

  Scenario:
    Given Navigate to url
    When Verify that home page is visible successfully
    And Click SignInLogin button
    And Verify Login to your account is visible
    And Enter correct email address and password
    And Click login button
    And Verify that Logged in as username is visible
    And Click Logout button
    Then Verify that user is navigated to login page