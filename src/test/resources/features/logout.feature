@SYMU10-416
Feature: Logout Functionality of Symund app
  As a user, I should be able to logout.

  Background:
    Given User is on the home page.

  @SYMU10-414
  Scenario:
    When Click to usernameInitialLink
    And Click to logOutBtn
    Then User can log out and should be on login page

  @SYMU10-415
  Scenario:
    When Back to the login page
    And Click to the stepBackBtn
    Then User should not login again and should be on the login page



