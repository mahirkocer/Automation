package automation.step_definitions;

import automation.pages.Homepage;
import automation.pages.RegistrationPage;
import automation.pages.SignUpPage;
import automation.utililties.BrowserUtils;
import automation.utililties.ConfigurationReader;
import automation.utililties.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterForm_StepDefinitions {
    RegistrationPage registerForm = new RegistrationPage();
    SignUpPage signUpPage = new SignUpPage();
    Homepage homepage = new Homepage();
    Faker faker = new Faker();

    @Given("Navigate to url")
    public void navigate_to_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        BrowserUtils.verifyTitle("Automation Exercise");
    }

    @When("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {
        Assert.assertTrue(homepage.singIn_LoginButton.isDisplayed());
        homepage.singIn_LoginButton.click();

    }
    @And("Click SignInLogin button")
    public void clickSignInLoginButton() {
        homepage.singIn_LoginButton.click();
    }


    @And("Enter {string} and {string} address")
    public void enterAndAddress(String name, String email) {
        registerForm.nameInput.sendKeys(faker.name().firstName());
        registerForm.emailInput.sendKeys(faker.letterify("????????@hotmail.com"));
    }

    @When("Click Signup button")
    public void click_signup_button() {
        registerForm.signupButton.click();

    }



}


