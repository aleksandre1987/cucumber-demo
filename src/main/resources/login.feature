Feature: Log in feature
  Scenario Outline:
    Given Log in page is opened
    And User provides <username> and <password>
    When user clicks on login button
    Then user should be logged in sucessfully






    Examples:
     |username      | password    |
     |standard_user | secret_sauce|
     |visual_user   | secret_sauce|
