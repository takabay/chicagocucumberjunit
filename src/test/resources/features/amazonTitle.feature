Feature: Amazon Title

  Scenario: Amazon Title verification
    When user goes to amazon application
    Then user should see proper title

    @amazon
    Scenario: Amazon url verification
      When user goes to amazon application
      Then user should validate url