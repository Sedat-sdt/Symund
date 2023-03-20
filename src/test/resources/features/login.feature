@SYMU10-322
Feature: Login Functionality of Symund app
  As a user, I should be able to login.

  @SYMU10-315
  Scenario: Login with valid credentials
    When Go to login page
    And Enter valid username "Employee130" into username field
    And Enter valid password "Employee123" into password field
    And Click on the login button
    Then User should login with valid credentials by clicking login button

  @SYMU10-316
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

  @SYMU10-317
  Scenario Outline: User can not login with empty credentials
    When Go to login page
    And Enter empty "<username>" or "<password>"
    And Click to the login button
    Then User should not login and should see the "Please fill out this field" message
    Examples:
      | username    | password    |
      |             | Employee123 |
      | Employee100 |             |
   
    @SYMU10-318
    Scenario: User can see the password in a form of dots by default
      When Go to login page
      And Enter valid password "Employee123" into password field
      Then User should see password in a form of dots

    @SYMU10-319
    Scenario: User can see the password explicitly if needed

      When Go to login page
      And Enter valid password "Employee123" into password field
      And Click to eyeImage
      Then User should see password as "Employee123"

    @SYMU10-320
    Scenario: User can see the "Reset Password" button on the next page after clicking on "Forgot password?" link on the login page

      When Go to login page
      And Click to "Forgot password?"
      Then User should see "Reset Password" button on the next page

    @SYMU10-321
    Scenario: User can see valid placeholders on Username and Password fields
      When Go to login page
      Then User should see placeholder on usernameInputBox
      And User should see placeholder on passwordInputBox

