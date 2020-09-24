package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.EbayPage;
import utilities.Driver;
/*
İlk önce "ebay.feature" oluşturalım.
Feature'a @ebayarama tag'ı verelim.
Scenario Outline oluşturalım.
 1. Adımda Ebay'a gidelim.
 2. Adımda arama kutusuna kelime ekleyelim ve arayalım
 3. Adımda sonuç sayısını ekrana yazdıralım.
 Examples: bölümüne araba, bebek arabası, bisiklet verilerini(3 tane) ekleyelim
 */

public class EbayStepDefinitions {
    EbayPage ebayPage = new EbayPage();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get(string);
    }

    @Given("kullanici ebayda aramakutusuna {string} yazar")
    public void kullanici_ebayda_aramakutusuna_yazar(String string) {
        ebayPage.aramaKutusu.sendKeys(string + Keys.ENTER );
    }
    @Then("kullanici ebaydaki sonuc sayisini ekrana yazar")
    public void kullanici_ebaydaki_sonuc_sayisini_ekrana_yazar() {
        String sonucSayisi = ebayPage.sonucSayisi.getText();
        System.out.println(sonucSayisi);
    }
}
