package automation.pages;

import automation.utililties.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    public RegistrationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserText;

    @FindBy(name = "name")
    public WebElement nameInput;
    

    @FindBy(xpath = "//input[@data-qa=\"signup-email\"]")
    public WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/button")
    public WebElement signupButton;

    @FindBy(id = "newsletter")
    public WebElement newsletter;

    @FindBy(id = "optin")
    public WebElement optin;



}
