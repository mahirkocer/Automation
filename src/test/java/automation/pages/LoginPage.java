package automation.pages;

import automation.utililties.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/h2")
    public WebElement loginToYourAccount;
    

    @FindBy(xpath = "//input[@type=\"password\"]")
    public WebElement loginPassword;

    @FindBy(xpath = "//button[@data-qa=\"login-button\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@data-qa=\"login-email\"]")
    public WebElement loginEmail;
    
    
}
