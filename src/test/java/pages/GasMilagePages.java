package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GasMilagePages {

    public GasMilagePages() throws Exception{
        PageFactory.initElements(Driver.getDriver(),this);

    }
       @FindBy(id = "uscodreading")
                public WebElement currentOdometerReadingInput;
       @FindBy(id = "uspodreading")
                public WebElement previousOdometerReadingInput;
       @FindBy(id = "usgasputin")
               public WebElement gasInput;
       @FindBy(xpath = "(//input[@alt='Calculate'])[1]")
                public WebElement calculateButton;
       @FindBy(xpath = "//*[@id=\"content\"]/p[2]/font/b")
               public WebElement resultInGallon;

    }

