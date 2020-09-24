package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BolcomPage {
    public BolcomPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "searchfor" )
    public WebElement zoekenDoos;

    @FindBy (className = "js_total_results")
    public WebElement aantalvanProducten;
}
