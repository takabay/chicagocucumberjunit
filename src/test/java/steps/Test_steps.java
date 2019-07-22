package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Test_steps {

    @When("user goes to google application")
    public void user_goes_to_google_application() {
        System.out.println("user going to application");
    }

    @Then("user searches for apple")
    public void user_searches_for_apple() {
        System.out.println("user searches for apple");

    }

    @Then("user should see apple related results")
    public void user_should_see_apple_related_results() {
        System.out.println("user sees the apple");
        Assert.fail("failing for reason");
    }

    @Then("user tests something")
    public void user_tests_something() {
        System.out.println("user tests the apple");
    }


}
