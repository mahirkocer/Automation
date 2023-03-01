package automation.step_definitions;

import automation.utililties.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.plugin.event.Node;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

   @Before
    public void before(){
        System.out.println("before");
    }

   @After
    public void tearDownScenario(){

//
//      byte []  screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//      scenario.attach(screenshot,"image/png",scenario.getName());

        Driver.closeDriver();
    }
}
