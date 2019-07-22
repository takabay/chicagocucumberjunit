package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.YoutubePages;
import utilities.Driver;

public class YoutubeSteps {

    YoutubePages yP = new YoutubePages();

    @Given("User is on the youtube homepage")
    public void user_is_on_the_youtube_homepage() {
        Driver.getDriver().get("https://youtube.com");
    }

    @Given("User is able to see the search box")
    public void user_is_able_to_see_the_search_box() {
     Assert.assertTrue(yP.youtubeSearchBox.isDisplayed());
    }

    @Given("User is able to see the search button")
    public void user_is_able_to_see_the_search_button() {
       Assert.assertTrue(yP.getYoutubeSearchButton.isDisplayed());
    }

    @When("User searches for FUNNY VAT VIDEOS")
    public void user_searches_for_FUNNY_VAT_VIDEOS() throws InterruptedException {
        Thread.sleep(2000);
        yP.youtubeSearchBox.sendKeys("FUNNY CAT VIDEOS"+ Keys.ENTER);
        Thread.sleep(2000);
    }

    @Then("User should see results related to funny cat videos")
    public void user_should_see_results_related_to_funny_cat_videos() {
        String actual = Driver.getDriver().getTitle();
        String expected = "cat";
        Assert.assertTrue("Does not contain",actual.contains(expected));
    }

    @When("User searches for FUNNY dog VIDEOS")
    public void user_searches_for_FUNNY_dog_VIDEOS() {
        yP.youtubeSearchBox.sendKeys("funny dog videos"+Keys.ENTER);
    }

    @Then("User should see results related to funny dog videos")
    public void user_should_see_results_related_to_funny_dog_videos() {
        String actual = Driver.getDriver().getTitle();
        String expected = "dog";
        Assert.assertTrue("Does not contain",actual.contains(expected));

    }

    @When("User searches for FUNNY pet VIDEOS")
    public void user_searches_for_FUNNY_pet_VIDEOS() {
        yP.youtubeSearchBox.sendKeys("funny pet videos"+Keys.ENTER);

    }

    @Then("User should see results related to funny pet videos")
    public void user_should_see_results_related_to_funny_pet_videos() {
        String actual = Driver.getDriver().getTitle();
        String expected = "pet";
        Assert.assertTrue("Does not contain",actual.contains(expected));
    }

}
