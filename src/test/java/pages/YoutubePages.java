package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YoutubePages {

    WebDriver driver;
    public YoutubePages(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='search']")
    public WebElement youtubeSearchBox;

    @FindBy(xpath = "//button[@id=search-icon-legacy']")
    public WebElement getYoutubeSearchButton;
}
