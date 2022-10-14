Feature: To Validate the login page of salesforce application

  Background:
    Given user navigates to salesforce application

  @Apple
  Scenario: To Validate the login with valid us & pw
    When User enter the username "learn more" and password "123"
    And User clicks the login button
    Then user navigates to the homepage

  @SmokeTest @Regession
  Scenario: To validate the error message
    Given user navigates to salesforce application
    When User enter the username "aravinth" and password "2334"
    And User clicks the login button
    Then validate the error message

  @Regression107 @RegessionSuit
  Scenario Outline: validate
    Given user navigates to salesforce application
    When User enter the username "<username>" and password "<password>"
    And User clicks the login button
    Then user navigates to the homepage

    Examples:
      | username | password |
      | us1      | 123      |
      | us2      | uru      |
      | us3      | fjdj     |




