package com.symund.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    @When("Go to login page")
    public void go_to_login_page() {

    }
    @When("Enter valid username {string} into username field")
    public void enter_valid_username_into_username_field(String string) {

    }
    @When("Enter valid password {string} into password field")
    public void enter_valid_password_into_password_field(String string) {

    }
    @When("Click on the login button")
    public void click_on_the_login_button() {

    }
    @Then("User should login with valid credentials by clicking login button")
    public void user_should_login_with_valid_credentials_by_clicking_login_button() {

    }

    @When("Enter invalid {string} or invalid {string}")
    public void enter_invalid_or_invalid(String string, String string2) {

    }
    @When("Click to the login button")
    public void click_to_the_login_button() {

    }
    @Then("User should not login and should see {string} message")
    public void user_should_not_login_and_should_see_message(String string) {

    }
    @When("Enter empty username or password")
    public void enter_empty_username_or_password() {

    }


}
