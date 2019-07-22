package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.WikiPage;
import utilities.Driver;

public class WikiSteps {

    WikiPage wp = new WikiPage();

    @Given("User is on Wikipedia homepage")
    public void user_is_on_Wikipedia_homepage() {
        Driver.getDriver().get("https://wikipedia.org");
    }

    @When("User enters steve jobs to search bar and clicks enter")
    public void user_enters_steve_jobs_to_search_bar_and_clicks_enter() {
        wp.searchButton.sendKeys("steve jobs"+ Keys.ENTER);
    }

    @Then("User should see the first header is displaying steve jobs")
    public void user_should_see_the_first_header_is_displaying_steve_jobs() {
        Assert.assertEquals(wp.firstHeader.getText(),"Steve Jobs");

    }
}
