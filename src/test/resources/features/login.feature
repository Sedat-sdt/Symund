Feature: Login Functionality of Symund app
  As a user, I should be able to login.

  @valid
  Scenario: Login with valid credentials
    When Go to login page
    And Enter valid username "Employee130" into username field
    And Enter valid password "Employee123" into password field
    And Click on the login button
    Then User should login with valid credentials by clicking login button

  @invalid
  Scenario Outline: User can not login with invalid credentials
    When Go to login page
    And Enter invalid "<username>" or invalid "<password>"
    And Click to the login button
    Then User should not login and should see "Wrong username or password." message
    Examples:
      | username    | password    |
      | Employee100 | Employe     |
      | Employe     | Employee123 |
      | Empl        | Employ      |

  @empty
  Scenario: User can not login with empty credentials
    When Go to login page
    And Enter empty username or password
    And Click to the login button
    Then User should not login and should see "Please fill out this field" message
