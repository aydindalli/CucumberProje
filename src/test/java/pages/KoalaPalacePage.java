package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KoalaPalacePage {

    // Constracture ile sayfaya gitme
    public KoalaPalacePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Giris yapma
    @FindBy (id = "UserName")
    public WebElement userNameBox;

    @FindBy (id="Password")
    public WebElement passwordBox;

    //@FindBy (id = "btnSubmit")
    //public WebElement login;

    @FindBy (xpath = "//button[.='Log in']")
    public WebElement button;


    // Hotel olusturma
    @FindBy (id = "Code")
    public WebElement hotelCreateCodeKutusu;

    @FindBy (id = "Name")
    public WebElement hotelCreateNameKutusu;

    @FindBy ( id = "Address")
    public WebElement hotelCreateAddressKutusu;

    @FindBy ( id = "Phone")
    public WebElement hotelCreatePhoneKutusu;

    @FindBy (id = "Email")
    public WebElement hotelCreateEmailKutusu;

    @FindBy (id = "IDGroup")
    public WebElement hotelCreateIDGroupDropdown;

    @FindBy (id = "btnSubmit")
    public WebElement hotelCreateSaveButonu;

    @FindBy (className = "bootbox-body")
    public WebElement hotelCreateBasariliYazisi;


    // Oda olusturma
    @FindBy (id = "IDHotel")
    public WebElement hotelRoomIDHotel;

    @FindBy (id = "Code")
    public WebElement hotelRoomCodeKutusu;

    @FindBy (id = "Name")
    public WebElement hotelRoomNameKutusu;

    @FindBy (id = "Location")
    public WebElement hotelRoomLocationKutusu;

    @FindBy (xpath = "//*[@id='cke_1_contents']/textarea")
    public WebElement hotelRoomDescriptionKutusu;

    @FindBy (id = "Price")
    public WebElement hotelRoomPriceKutusu;

    @FindBy (xpath = "//*[@data-id='500']/a")
    public WebElement hotelRoomPrice500;

    @FindBy (id = "IDGroupRoomType")
    public WebElement hotelRoomType;

    @FindBy (id = "MaxAdultCount")
    public WebElement hotelRoomAdultKutusu;

    @FindBy (id = "MaxChildCount")
    public WebElement hotelRoomChilderenKutusu;

    @FindBy (id = "btnSubmit")
    public WebElement hotelRoomCreateSaveButonu;

    @FindBy ( className = "bootbox-body")
    public WebElement hotelRoomCreateBasariliYazisi;


    // Hotel reservation
    @FindBy ( id = "IDUser" )
    public WebElement hotelRoomReservationCreateIDUserDropdown;

    @FindBy ( id = "IDHotelRoom")
    public WebElement hotelRoomReservationCreateIDHotelRoomDropdown ;

    @FindBy ( id = "Price")
    public WebElement hotelRoomReservationCreatePriceKutusu ;

    @FindBy ( id = "DateStart")
    public WebElement hotelRoomReservationCreateDateStartKutusu ;

    @FindBy ( id = "DateEnd")
    public WebElement hotelRoomReservationCreateDateEndKutusu ;

    @FindBy ( id = "AdultAmount")
    public WebElement hotelRoomReservationCreateAdultAmountKutusu ;

    @FindBy ( id = "ChildrenAmount")
    public WebElement hotelRoomReservationCreateChildrenAmountKutusu ;

    @FindBy ( id = "ContactNameSurname")
    public WebElement hotelRoomReservationCreateNameSurnameKutusu ;

    @FindBy ( id = "ContactPhone")
    public WebElement hotelRoomReservationCreatePhoneKutusu ;

    @FindBy ( id = "ContactEmail")
    public WebElement hotelRoomReservationCreateEmailKutusu ;

    @FindBy ( id = "Notes")
    public WebElement hotelRoomReservationCreateNotesKutusu ;

    @FindBy ( id = "btnSubmit")
    public WebElement hotelRoomReservationCreateSaveButonu ;

    @FindBy ( className = "bootbox-body")
    public WebElement hotelRoomReservationCreateBasariliYazisi;

    @FindBy ( xpath = "//label[@class='error']")
    public WebElement hataMesaji;

}


