package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPages {

     WebDriver driver;

    public AmazonPages(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
@FindBy(id = "twotabsearchbox")
    public WebElement amazonSearchBox;

    @FindBy(xpath = "//a[@id='bcKwText']/span")
    public WebElement amazonSearchresult;

}
