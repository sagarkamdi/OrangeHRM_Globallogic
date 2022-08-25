Feature: Validation of ADD User

  #Author:Sagar
  Scenario: Add User
    Given Open the browser
    When Enter valid username "<username>" and Password "<password>"
    Then Click on Admin button
