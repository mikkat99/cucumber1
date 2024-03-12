package steps;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import static utils.DriverManager.closeDriver;
import static utils.DriverManager.getWebDriver;

public class Hooks {
    final WebDriver driver = getWebDriver();

    @After
    public void tearDown(Scenario scenario) {
        String screenshotName = scenario.getName().replace(" ", "_");
        try {
            if (scenario.isFailed()){
                TakesScreenshot ts = (TakesScreenshot) driver;
                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", screenshotName);
                scenario.log(("Alarma!"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        closeDriver();

    }
}
