package automation.step_definitions;

import automation.pages.LoginPage;
import automation.utililties.ConfigurationReader;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginPage_StepDefinitions {
LoginPage loginPage = new LoginPage();

    @When("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
Assert.assertTrue(loginPage.loginToYourAccount.isDisplayed());

    }
    @When("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        loginPage.loginEmail.sendKeys("mahir@gmail.com ");
        loginPage.loginPassword.sendKeys("20020143");
    ;
    }
    @When("Click login button")
    public void click_login_button() {
        loginPage.loginButton.click();

    }
    @When("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {

    }
}
