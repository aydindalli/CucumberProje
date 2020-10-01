package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    // TestNG deki @BeforeMethod gibi calisir
    // Her senaryodan once calisir

    @Before
    public void setUp(){
        System.out.println("setup calisti");
    }

    // Her senaryodan sonra calisir
    @After
    public void tearDown(Scenario scenario){
        System.out.println("tearDown calisti");

        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        // Eger senaryonun sonucu FAILED(basarisiz) ise ekran goruntusunu rapora ekler
        if (scenario.isFailed()){
            scenario.embed(screenshot,"image/png");
        }
        Driver.closeDriver();

    }
}
