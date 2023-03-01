Feature: Registration form page

  Scenario Outline:


    Given Navigate to url
    When Verify that home page is visible successfully
    And Click SignInLogin button
    And Verify New User Signup! is visible
    And Enter "<name>" and "<email>" address
    And Click Signup button
    And Verify that ENTER ACCOUNT INFORMATION is visible
    And Fill details: "<Title>", "<Password>", "<Day>", "<Month>", "<Year>"
    And Select checkbox Sign up for our newsletter!
    And Select checkbox Receive special offers from our partners!
    And Fill details: First name,Last name, Company, Address, Country, State, City, Zipcode, Mobile Number
    And Click Create Account button
    And Verify that ACCOUNT CREATED! is visible
    And Click Continue button
    And Verify that Logged in as "<name>" is visible
    And  Click Delete Account button
    And Verify that ACCOUNT DELETED! is visible
    Then Click Continue button


    Examples:
      | Title | Password | Day | Month | Year | name  |
      | Mr    | 20020143 | 21  | 11    | 2000 | mahir |


