package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AmazonPages;
import utilities.Driver;

public class AmazonSteps {

    WebDriver driver;
   AmazonPages amazonP = new AmazonPages();

    @Given("User is on the amazon homepage")
    public void user_is_on_the_amazon_homepage() {
        Driver.getDriver().get("https://amazon.com");
    }

    @When("User enters headphones keyword")
    public void user_enters_headphones_keyword() {
    amazonP.amazonSearchBox.sendKeys("headphones");
    }

    @When("User clicks to search button")
    public void user_clicks_to_search_button() {
        amazonP.amazonSearchBox.click();
    }

    @Then("User should see headphones in results")
    public void user_should_see_headphones_in_results() {
        String actualText = amazonP.amazonSearchresult.getText();
        Assert.assertTrue("The keyword headphone was not located",
                actualText.contains("headphones"));
    }

}
