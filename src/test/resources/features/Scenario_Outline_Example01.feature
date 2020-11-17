@datatable01  @third

Feature: scenario outline example
  Scenario: testing the data tables web page
    Given User is on the datatables homepage
    When User clicks on new button
    And User enters first name "Pinar"
    And User enters last name "Can"
    And User enters position  "SDET"
    And User enters office  "London"
    And User enters extension "111"
    And User enters start date "2020-08-26"
    And User enters salary "120000"
    And User clicks Create button
    And User enters first name "Pinar" to the searchbox
    Then verify that user see the first name "Pinar" in the searchbox