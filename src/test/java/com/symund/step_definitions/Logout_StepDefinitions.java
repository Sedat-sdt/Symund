package com.symund.step_definitions;

import com.symund.pages.SymundDashboardPage;
import com.symund.pages.SymundLoginPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_StepDefinitions {


    SymundLoginPage symundLoginPage=new SymundLoginPage();
    SymundDashboardPage symundDashboardPage= new SymundDashboardPage();

    @Given("User is on the home page.")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        symundLoginPage.usernameInputBox.sendKeys(ConfigurationReader.getProperty("username"));
        symundLoginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        symundLoginPage.loginBtn.click();

    }
    @When("Click to usernameInitialLink")
    public void click_to_username_initial_link() {

        symundDashboardPage.usernameInitialLink.click();

    }

    @When("Click to logOutBtn")
    public void click_to_log_out_btn() {

        symundDashboardPage.logOutBtn.click();
        BrowserUtils.sleep(3);
    }

    @Then("User can log out and should be on login page")
    public void user_can_log_out_and_should_be_on_login_page() {

        Assert.assertTrue(symundLoginPage.usernameInputBox.isDisplayed());

    }

    @When("Back to the login page")
    public void back_to_the_login_page() {
        symundDashboardPage.usernameInitialLink.click();
        BrowserUtils.sleep(3);
        symundDashboardPage.logOutBtn.click();

    }
    @When("Click to the stepBackBtn")
    public void click_to_the_step_back_btn() {

       Driver.getDriver().navigate().back();

    }
    @Then("User should not login again and should be on the login page")
    public void user_should_not_login_again_and_should_be_on_the_login_page() {

        Assert.assertTrue(symundLoginPage.usernameInputBox.isDisplayed());

    }

}
