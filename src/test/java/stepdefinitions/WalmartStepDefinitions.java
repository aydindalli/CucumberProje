package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.WalmartPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class WalmartStepDefinitions {

    WalmartPage walmartPage=new WalmartPage();


    @Given("kullanici walmart aramaKutusuna {string} yazar ve arar")
    public void kullanici_walmart_aramaKutusuna_yazar_ve_arar(String string) {
        walmartPage.aramaKutusu.sendKeys(string + Keys.ENTER);
    }

    @Then("kullanici walmart sonuc sayisini ekrana yazdirir")
    public void kullanici_walmart_sonuc_sayisini_ekrana_yazdirir() {
        System.out.println(walmartPage.sonucSayisi.getText());
    }
}
