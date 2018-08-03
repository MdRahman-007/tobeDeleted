@regression @temp


Feature: Verify temp timeline

  @temp-1
  Scenario: Verify timeline is displayed in correct format
    Given I am on Darksky home page
    Then  I verify timeline is displayed with two hours incremented


  @temp-2
  Scenario: Verify individual day temp timeline
    Given I am on Darksky home page
    When  I expand todays timeline
    Then  I verify lowest and highest temp is displayed correctly


  @temp-3
  Scenario: Verify time machine calendar
    Given I am on Darksky home page
    When  I click on Time machine
    Then  I verify date is selected to todays date
