package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.KoalaPalacePage;
import utilities.Driver;

public class KoalaPalaceStepDef {


    KoalaPalacePage page = new KoalaPalacePage();
    @Given("kullanici koalapalace admin sayfasina gider")
    public void kullanici_koalapalace_admin_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin");
    }
    @Given("kullanici kullaniciadi ve sifresini girer")
    public void kullanici_kullaniciadi_ve_sifresini_girer() {
        page.userNameBox.sendKeys("manager2");
        page.passwordBox.sendKeys("Man1ager2!");
    }
    @Then("kullanici giris islemini gerceklestirir")
    public void kullanici_giris_islemini_gerceklestirir() {
        page.button.click();
    }
    @Given("kullanici hotelcreate sayfasina gider")
    public void kullanici_hotelcreate_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelAdmin/Create");
    }
    @Given("kullanici hotelcreate code bolumune {string} girer")
    public void kullanici_hotelcreate_code_bolumune_girer(String string) {
        page.hotelCreateCodeKutusu.sendKeys(string);
    }
    @Given("kullanici hotelcreate name bolumune {string} girer")
    public void kullanici_hotelcreate_name_bolumune_girer(String string) {
        page.hotelCreateNameKutusu.sendKeys(string);
    }
    @Given("kullanici hotelcreate adress bolumune {string} girer")
    public void kullanici_hotelcreate_adress_bolumune_girer(String string) {
        page.hotelCreateAddressKutusu.sendKeys(string);
    }
    @Given("kullanici hotelcreate phone bolumune {string} girer")
    public void kullanici_hotelcreate_phone_bolumune_girer(String string) {
        page.hotelCreatePhoneKutusu.sendKeys(string);
    }
    @Given("kullanici hotelcreate email bolumune {string} girer")
    public void kullanici_hotelcreate_email_bolumune_girer(String string) {
        page.hotelCreateEmailKutusu.sendKeys(string);
    }
    @Given("kullanici hotelcreate idgroup bolumunde {string} secer")
    public void kullanici_hotelcreate_idgroup_bolumunde_secer(String string) {
        Select select = new Select(page.hotelCreateIDGroupDropdown);
        select.selectByVisibleText(string);
    }
    @Given("kullanici hotelcreate save butonuna tiklar")
    public void kullanici_hotelcreate_save_butonuna_tiklar() {

        page.hotelCreateSaveButonu.click();
    }

    @Then("kullanici hotelcreate kayit islemini assert eder")
    public void kullanici_hotelcreate_kayit_islemini_assert_eder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(page.hotelCreateBasariliYazisi.getText());
    }
    @Then("kullanici driveri kapatir")
    public void kullanici_driveri_kapatir() {

        Driver.closeDriver();
    }

    // Room create etme

    @Given("kullanici hotelroomcreate sayfasina gider")
    public void kullanici_hotelroomcreate_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelroomAdmin/Create");
    }

    @Given("kullanici hotelroomcreate idgroup bolumune {string} secer")
    public void kullanici_hotelroomcreate_idgroup_bolumune_secer(String string) {
        Select select=new Select(page.hotelRoomIDHotel);
        select.selectByVisibleText(string);
    }

    @Given("kullanici hotelroomcreate code bolumune {string} girer")
    public void kullanici_hotelroomcreate_code_bolumune_girer(String string) {
        page.hotelRoomCodeKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomcreate name bolumune {string} girer")
    public void kullanici_hotelroomcreate_name_bolumune_girer(String string) {
        page.hotelRoomNameKutusu.sendKeys(string);
    }

    @Given("kullanici hoteroomcreate location bolumune {string} girer")
    public void kullanici_hoteroomcreate_location_bolumune_girer(String string) {
        page.hotelRoomLocationKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomcreate description bolumune {string} girer")
    public void kullanici_hotelroomcreate_description_bolumune_girer(String string) {
        page.hotelRoomDescriptionKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomcreate price bolumune fiyat girer")
    public void kullanici_hotelroomcreate_price_bolumune_fiyat_girer() {
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(page.hotelRoomPrice500, page.hotelRoomPriceKutusu).perform();
    }

    @Given("kullanici hotelroomcreate roomtype bolumunde {string} secer")
    public void kullanici_hotelroomcreate_roomtype_bolumunde_secer(String string) {
        Select select=new Select(page.hotelRoomType);
        select.selectByVisibleText(string);
    }

    @Given("kullanici hotelroomcreate maxadult bolumune {string} girer")
    public void kullanici_hotelroomcreate_maxadult_bolumune_girer(String string) {
        page.hotelRoomAdultKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomcreate maxchilderen bolumune {string} girer")
    public void kullanici_hotelroomcreate_maxchilderen_bolumune_girer(String string) {
        page.hotelRoomChilderenKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomcreate save butonuna tiklar")
    public void kullanici_hotelroomcreate_save_butonuna_tiklar() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.hotelCreateSaveButonu.click();
    }


    @Then("kullanici hotelroomcreate kayit islemini assert eder")
    public void kullanici_hotelroomcreate_kayit_islemini_assert_eder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());
    }


    // Hotel reservation olusturma

    @Given("kullanici hotelroomreservation sayfasina gider")
    public void kullanici_hotelroomreservation_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin/Create");
    }

    @Given("kullanici roomreservation iduser bolumunde {string} secer")
    public void kullanici_roomreservation_iduser_bolumunde_secer(String string) {
        Select select=new Select(page.hotelRoomReservationCreateIDUserDropdown);
        select.selectByVisibleText(string);
    }

    @Given("kullanici roomreservation idhotelroom bolumunde {string} secer")
    public void kullanici_roomreservation_idhotelroom_bolumunde_secer(String string) {
        Select select=new Select(page.hotelRoomReservationCreateIDHotelRoomDropdown);
        select.selectByVisibleText(string);
    }

    @Given("kullanici roomreservation price bolumune {string} girer")
    public void kullanici_roomreservation_price_bolumune_girer(String string) {
        page.hotelRoomReservationCreatePriceKutusu.sendKeys(string);
    }

    @Given("kullanici roomreservation datestart bolumune {string} girer")
    public void kullanici_roomreservation_datestart_bolumune_girer(String string) {
        page.hotelRoomReservationCreateDateStartKutusu.sendKeys(string);
    }

    @Given("kullanici roomreservation dateend bolumune {string} girer")
    public void kullanici_roomreservation_dateend_bolumune_girer(String string) {
        page.hotelRoomReservationCreateDateEndKutusu.sendKeys(string);
    }

    @Given("kullanici roomreservation adultamaount bolumune {string} girer")
    public void kullanici_roomreservation_adultamaount_bolumune_girer(String string) {
        page.hotelRoomReservationCreateAdultAmountKutusu.sendKeys(string);
    }

    @Given("kullanici roomreservation childrenamount bolumune {string} girer")
    public void kullanici_roomreservation_childrenamount_bolumune_girer(String string) {
        page.hotelRoomReservationCreateChildrenAmountKutusu.sendKeys(string);
    }

    @Given("kullanici roomreservation namesurname bolumune {string} girer")
    public void kullanici_roomreservation_namesurname_bolumune_girer(String string) {
        page.hotelRoomReservationCreateNameSurnameKutusu.sendKeys(string);
    }

    @Given("kullanici roomreservation phone bolumune {string} girer")
    public void kullanici_roomreservation_phone_bolumune_girer(String string) {
        page.hotelRoomReservationCreatePhoneKutusu.sendKeys(string);
    }

    @Given("kullanici roomreservation email bolumune {string} girer")
    public void kullanici_roomreservation_email_bolumune_girer(String string) {
        page.hotelRoomReservationCreateEmailKutusu.sendKeys(string);
    }

    @Given("kullanici roomreservation notes bolumune {string} girer")
    public void kullanici_roomreservation_notes_bolumune_girer(String string) {
        page.hotelRoomReservationCreateNotesKutusu.sendKeys(string);
    }

    @Given("kullanici roomreservation save butonuna tiklar")
    public void kullanici_roomreservation_save_butonuna_tiklar() {
        page.hotelRoomReservationCreateSaveButonu.click();
    }

    @Then("kullanici roomreservation kayit islemini assert eder")
    public void kullanici_roomreservation_kayit_islemini_assert_eder() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(page.hotelRoomReservationCreateBasariliYazisi.getText());
    }
    @Then("kullanici roomreservation kayit isleminin basarisiz oldugunu assert eder")
    public void kullanici_roomreservation_kayit_isleminin_basarisiz_oldugunu_assert_eder() {
        System.out.println(page.hataMesaji.getText());
        Assert.assertTrue(page.hataMesaji.isDisplayed());
    }
}

