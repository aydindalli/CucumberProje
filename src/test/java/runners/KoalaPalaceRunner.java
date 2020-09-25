package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},  // rapor oluşturmak için

        features = "src/test/resources/features",    // features klasörünün adresini
        glue = "stepdefinitions",      // testlerinin içerisinde olduğu paketin ismi
        tags = "@KoalaPalace",
        dryRun = false
)
public class KoalaPalaceRunner {
}
