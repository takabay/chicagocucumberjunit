package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.GooglePage;
import utilities.Driver;

public class GoogleSteps {
    GooglePage gp = new GooglePage();


    @Given("User is on the google homepage")
    public void user_is_on_the_google_homepage() {
        Driver.getDriver().get("https://google.com");
    }

    @Given("User enters flowers keyword")
    public void user_enters_flowers_keyword() {
        gp.searchBox.sendKeys("flowers");
    }

    @When("User clicks search button")
    public void user_clicks_search_button() {
        gp.searchBox.click();
    }

    @Then("User should see results related to flowers")
    public void user_should_see_results_related_to_flowers() {
         String actualTitle = Driver.getDriver().getTitle();
       Assert.assertTrue("Keyword flowers was not located in title",
                actualTitle.contains("flowers"));

    }

}
