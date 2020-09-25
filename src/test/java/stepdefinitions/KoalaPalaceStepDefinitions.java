package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.KoalaPalacePage;
import utilities.ConfigurationReader;
import utilities.Driver;

import javax.net.ssl.KeyStoreBuilderParameters;

public class KoalaPalaceStepDefinitions {

    KoalaPalacePage koalaPalacePage=new KoalaPalacePage();

    @Given("user must visit {string}")
    public void user_must_visit(String string) {
        Driver.getDriver().get(string);
    }

    @Given("user must enter a valid username")
    public void user_must_enter_a_valid_username() {
        koalaPalacePage.userNameBox.sendKeys(ConfigurationReader.getProperty("usernameFHC")+ Keys.ENTER);
    }

    @Then("user must enter a valid password")
    public void user_must_enter_a_valid_password() {
        koalaPalacePage.passwordBox.sendKeys(ConfigurationReader.getProperty("passwordFHC")+Keys.ENTER);
    }
}
