package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KoalaPalacePage {

    public KoalaPalacePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "UserName")
    public WebElement userNameBox;

    @FindBy (id="Password")
    public WebElement passwordBox;

    @FindBy (id = "btnSubmit")
    public WebElement login;

}
