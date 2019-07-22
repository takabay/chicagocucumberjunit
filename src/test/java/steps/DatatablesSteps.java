package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.DatatablesPages;
import utilities.Driver;

public class DatatablesSteps {

DatatablesPages dp = new DatatablesPages();
    @Given("User is on the datatables hompeage")
    public void user_is_on_the_datatables_hompeage() throws InterruptedException {
        Driver.getDriver().get("https://editor.datatables.net");

    }

    @Given("User clicks to New Button")
    public void user_clicks_to_New_Button() {
   dp.newButton.click();
    }

    @Then("User should see Create New Entry Box")
    public void user_should_see_Create_New_Entry_Box() {
        Assert.assertTrue(dp.createNewHeader.isDisplayed());
    }

    @Then("User should enter firstName")
    public void user_should_enter_firstName() {
        dp.firstName.sendKeys("Sovet");

    }

    @Then("User should enter lastName")
    public void user_should_enter_lastName() {
        dp.lastName.sendKeys("Abdykaiymov");
    }

    @Then("User should enter position")
    public void user_should_enter_position() {
       dp.position.sendKeys("Tester");
    }

    @Then("User should enter office")
    public void user_should_enter_office() {
     dp.office.sendKeys("Chicago");
    }

    @Then("User should enter extension")
    public void user_should_enter_extension() {
        dp.extension.sendKeys("773");
    }

    @Then("User should enter start date")
    public void user_should_enter_start_date() {
   dp.startDate.sendKeys("2019-07-09");
    }

    @Then("User should enter salary")
    public void user_should_enter_salary() {
        dp.salary.sendKeys("120000");
    }

    @Then("User should click to create button")
    public void user_should_click_to_create_button() {
     dp.creatButton.click();
    }

    @Then("User enters first name to search box")
    public void user_enters_first_name_to_search_box() {
      dp.searchBox.sendKeys("Sovet");
    }

    @Then("User should see first name is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table() {
        Assert.assertTrue(dp.firstResult.getText().contains("Sovet"));
    }

    @Then("User should enter firstName {string}")
    public void user_should_enter_firstName(String string) {
  dp.firstName.sendKeys(string);
    }

    @Then("User should enter lastName {string}")
    public void user_should_enter_lastName(String string) {
 dp.lastName.sendKeys(string);
    }

    @Then("User enters first name {string} to search box")
    public void user_enters_first_name_to_search_box(String string) {
  dp.searchBox.sendKeys(string);
    }

    @Then("User should see first name {string} is inserted in the table")
    public void user_should_see_first_name_is_inserted_in_the_table(String string) {
   String expected =string;
   Assert.assertTrue(dp.firstResult.getText().contains(expected));
    }

}
