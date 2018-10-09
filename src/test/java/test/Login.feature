Feature: Login feature
  This feature tests for positive and negative login scenarios
#this is comments

  Scenario: Positive Login Scenario
    Given I am able to acces magento web page
    And I click on user icon
    When I input the username as "bhosalenb"
    And I input the password as "Welcome1234"
    And I click on login button
    Then I should see the magento ID as "ID: MAG12312"

