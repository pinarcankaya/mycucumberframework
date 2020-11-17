@datatable1
Feature: Single Data table
  Scenario Outline: TC01_ google search test
    Given user is in the google page
    And user searches iphone "<value>"
    Then verify result has iphone "<value>"


    Examples: Test Data
    |value|
    |Selenium|
    |Cucumber|
    |Automation Tester|
    |Istanbul         |