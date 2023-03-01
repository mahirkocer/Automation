package automation.step_definitions;

import automation.pages.User_Login_Page;
import automation.utililties.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LogoutPage_StepDefinitions {
User_Login_Page userPage = new User_Login_Page();
    @When("Click Logout button")
    public void click_logout_button() {
        userPage.logoutButton.click();

    }
    @Then("Verify that user is navigated to login page")
    public void verify_that_user_is_navigated_to_login_page() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);
        wait.until(ExpectedConditions.urlContains("login"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://automationexercise.com/login");

    }
}
