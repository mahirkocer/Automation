package automation.pages;

import automation.utililties.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    public SignUpPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div[1]/h2/b")
    public WebElement enterYourAccountText;

    @FindBy(css = "[data-qa = 'password']")
    public WebElement password;

    @FindBy(css = "[data-qa = 'days']")
    public WebElement days;

    @FindBy(xpath = "//*[@id='months']")
    public WebElement months;

    @FindBy(xpath = "//*[@id='years']")
    public WebElement years;

    @FindBy(id = "newsletter")
    public WebElement newsletter;

    @FindBy(id = "optin")
    public WebElement optin;

    @FindBy(css = "[data-qa = 'first_name']")
    public WebElement firstName;

    @FindBy(css = "[data-qa = 'last_name']")
    public WebElement lastName;

    @FindBy(css = "[data-qa = 'company']")
    public WebElement company;

    @FindBy(css = "[data-qa = 'country']")
    public WebElement country;

    @FindBy(css = "[data-qa = 'state']")
    public WebElement state;

    @FindBy(xpath = "//*[@id='city']")
    public WebElement city;

    @FindBy(css = "[data-qa = 'zipcode']")
    public WebElement zipcode;

    @FindBy(css = "[data-qa = 'mobile_number']")
    public WebElement mobileNumber;

    @FindBy(css = "[data-qa = 'create-account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "/html/body/section/div/div/div/div[1]/form/div[1]/label")
    public WebElement title;

    @FindBy(id = "address1")
    public WebElement address;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/h2/b")
    public WebElement accountCreatedText;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
    public WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")
    public WebElement loggedInAsUserLink;

}
