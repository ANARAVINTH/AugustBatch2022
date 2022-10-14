Feature:

  Background:
   # Given user navigate to URL

  @windowhandle
    Scenario: WinHandle
    When Handle

  @MapExmaple
    Scenario: Map
    When Use Map

  @StaticDropdown
  Scenario:  Dropdown validation
    When User selects the value from dropdown

  @dynamicDropdown @Regression @TSIC1234
  Scenario: dynamic Dropdown validation
    Given user navigate to URL
    When User selects the value from dynamic dropdown

  @AutoSuggestive @Alpha
  Scenario: Auto Suggestive dropdown Validation
    Given user navigate to URL
    When User selects the value from Auto suggestive dropdown

  @while
  Scenario: Loop
    Given user navigate to URL
    When User selects the respective month

  @Frame @Table
  Scenario: frame
    When Handle the frame

  @Table
  Scenario:  table
    When Handle the table
