package automation.utililties;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class BrowserUtils {
    public static void verifyTitle(String expected){
        Assert.assertTrue(expected.equals(Driver.getDriver().getTitle()));
    }
    public static void selectDropDown(WebElement dropDown,String value){
        Select select = new Select(dropDown);
        select.selectByValue(value);

    }
    public static void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,750)");
    }

}
