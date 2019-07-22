@datatableSO
Feature: Testing datatables website

  Scenario Outline: Testing adding new emoloyee to the table

    Given User is on the datatables hompeage
    And User clicks to New Button
    Then User should see Create New Entry Box
    And User should enter firstName "<firstname>"
    And User should enter lastName "<lastname>"
    And User should enter position
    And User should enter office
    And User should enter extension
    And User should enter start date
    And User should enter salary
    Then User should click to create button
    And User enters first name "<firstname>" to search box
    Then User should see first name "<firstname>" is inserted in the table

    Examples: Test data for datatables

    |firstname|lastname   |
    |joe      |lee        |
    |Erbol    |Kerimbay   |
    |sovet    |Abdykaiymov|