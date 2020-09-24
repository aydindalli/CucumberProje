package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.BolcomPage;
import utilities.Driver;

public class BolcomStepDefinitions {

    BolcomPage bolcomPage=new BolcomPage();

    @Given("gebruiker gaat op website {string}")
    public void gebruiker_gaat_op_website(String string) {
        Driver.getDriver().get(string);
    }

    @Given("gebruiker schrijft {string} in de zoekdoos")
    public void gebruiker_schrijft_in_de_zoekdoos(String string) {
        bolcomPage.zoekenDoos.sendKeys(string+ Keys.ENTER);
    }

    @Then("gebruiker schrijft de gevolgen op")
    public void gebruiker_schrijft_de_gevolgen_op() {
        System.out.println(bolcomPage.aantalvanProducten.getText());
    }
}
