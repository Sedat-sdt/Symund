package com.symund.step_definitions;

import com.symund.pages.SymundDashboardPage;
import com.symund.pages.SymundLoginPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    SymundLoginPage symundLoginPage=new SymundLoginPage();
    SymundDashboardPage symundDashboardPage= new SymundDashboardPage();

    @When("Go to login page")
    public void go_to_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("Enter valid username {string} into username field")
    public void enter_valid_username_into_username_field(String username) {

        symundLoginPage.usernameInputBox.sendKeys(ConfigurationReader.getProperty("username"));

    }
    @When("Enter valid password {string} into password field")
    public void enter_valid_password_into_password_field(String password) {
        symundLoginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));

    }
    @When("Click on the login button")
    public void click_on_the_login_button() {
        symundLoginPage.loginBtn.click();


    }
    @Then("User should login with valid credentials by clicking login button")
    public void user_should_login_with_valid_credentials_by_clicking_login_button() {

        Assert.assertTrue(symundDashboardPage.recommendedFiles.isDisplayed());
    }

    @When("Enter invalid {string} or invalid {string}")
    public void enter_invalid_or_invalid(String username, String password) {

        symundLoginPage.usernameInputBox.sendKeys("username");
        symundLoginPage.passwordInputBox.sendKeys("password");

    }
    @When("Click to the login button")
    public void click_to_the_login_button() {

        symundLoginPage.loginBtn.click();


    }
    @Then("User should not login and should see {string} message")
    public void user_should_not_login_and_should_see_message(String message) {


        Assert.assertEquals(message,symundLoginPage.wrongMessage.getText());

    }
/*    @When("Enter empty username or password")
    public void enter_empty_username_or_password() {

        symundLoginPage.usernameInputBox.sendKeys("");
        symundLoginPage.passwordInputBox.sendKeys("");

    }*/
    @When("Enter empty {string} or {string}")
    public void enter_empty_or(String username, String password) {
        symundLoginPage.usernameInputBox.sendKeys("username");
        symundLoginPage.passwordInputBox.sendKeys("password");


    }

    @Then("User should not login and should see the {string} message")
    public void user_should_not_login_and_should_see_the_message(String fillMessage) {

        String message = symundLoginPage.usernameInputBox.getAttribute("validationMessage");

        if (symundLoginPage.usernameInputBox.getAttribute("required").equals("required")){
            Assert.assertEquals(fillMessage,message);
        }

        if (symundLoginPage.passwordInputBox.getAttribute("required").equals("required")){

            Assert.assertEquals(fillMessage,message);

        }



    }

    @Then("User should see password in a form of dots")
    public void user_should_see_password_in_a_form_of_dots() {
       Assert.assertEquals("password",symundLoginPage.passwordInputBox.getAttribute("type"));
    }

    @When("Click to eyeImage")
    public void click_to_eye_image() {
      symundLoginPage.eyeImg.click();

    }


    @Then("User should see password as {string}")
    public void user_should_see_password_as(String password) {
       Assert.assertEquals("text",symundLoginPage.passwordInputBox.getAttribute("type"));

    }
    @When("Click to {string}")
    public void click_to(String forgotLink) {

        symundLoginPage.forgotPasswordLink.click();

    }
    @Then("User should see {string} button on the next page")
    public void user_should_see_button_on_the_next_page(String resetBtn) {


        Assert.assertTrue(symundLoginPage.resetPasswordBtn.isDisplayed());


    }
    @Then("User should see placeholder on usernameInputBox")
    public void user_should_see_placeholder_on_username_input_box() {
        Assert.assertEquals("Username or email",symundLoginPage.usernameInputBox.getAttribute("placeholder"));

    }
    @Then("User should see placeholder on passwordInputBox")
    public void user_should_see_placeholder_on_password_input_box() {
        Assert.assertEquals("Password",symundLoginPage.passwordInputBox.getAttribute("placeholder"));

    }

}
