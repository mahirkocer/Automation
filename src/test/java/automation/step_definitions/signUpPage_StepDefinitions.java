package automation.step_definitions;

import automation.pages.SignUpPage;
import automation.pages.User_Login_Page;
import automation.utililties.BrowserUtils;
import automation.utililties.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class signUpPage_StepDefinitions {
    SignUpPage signUpPage = new SignUpPage();
    User_Login_Page userPage = new User_Login_Page();
    Faker faker = new Faker();

    @When("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verify_that_enter_account_information_is_visible() {
        Assert.assertTrue(signUpPage.title.isDisplayed());

    }

    @And("Fill details: {string}, {string}, {string}, {string}, {string}")
    public void fillDetails(String title, String password, String day, String month, String year) {
        signUpPage.password.sendKeys(password);
        BrowserUtils.selectDropDown(signUpPage.days, day);
        BrowserUtils.selectDropDown(signUpPage.months, month);
        BrowserUtils.selectDropDown(signUpPage.years, year);

        BrowserUtils.scrollDown();
    }


    @When("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {
        signUpPage.newsletter.click();
    }

    @When("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {
        signUpPage.optin.click();

    }

    @And("Fill details: First name,Last name, Company, Address, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressCountryStateCityZipcodeMobileNumber() {
        signUpPage.firstName.sendKeys(faker.name().firstName());
        signUpPage.lastName.sendKeys(faker.name().lastName());
        signUpPage.company.sendKeys("Apple");
        signUpPage.address.sendKeys(faker.address().fullAddress());
        BrowserUtils.selectDropDown(signUpPage.country, "Canada");
        signUpPage.state.sendKeys(faker.address().state());
        signUpPage.zipcode.sendKeys(faker.address().zipCode());
        signUpPage.city.sendKeys(faker.address().city());
        signUpPage.mobileNumber.sendKeys(faker.numerify("#### ######"));


    }


    @When("Click Create Account button")
    public void click_create_account_button() {
        signUpPage.createAccountButton.click();

    }

    @When("Verify that ACCOUNT CREATED! is visible")
    public void verify_that_account_created_is_visible() {
        Assert.assertTrue(signUpPage.accountCreatedText.isDisplayed());
    }

    @When("Click Continue button")
    public void click_continue_button() {
        signUpPage.continueButton.click();

    }

    @When("Verify that Logged in as {string} is visible")
    public void verify_that_logged_in_as_username_is_visible(String name) {
      //  Assert.assertTrue(signUpPage.loggedInAsUserLink.getText().equals(name));

    }


//    @And("Click on Signup button")
//    public void clickOnSignupButton() {
//    }


    @And("Click Delete Account button")
    public void clickDeleteAccountButton() {
        WebDriverWait wait =new WebDriverWait(Driver.getDriver(),20);
        wait.until(ExpectedConditions.visibilityOf(userPage.deleteAccountButton));
        userPage.deleteAccountButton.click();

    }

    @And("Verify that ACCOUNT DELETED! is visible")
    public void verifyThatACCOUNTDELETEDIsVisible() {
       Assert.assertTrue(userPage.accountDeletedText.isDisplayed());
    }
}
