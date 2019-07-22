package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        plugin = {"html:target/cucumberReports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"})


public class FailedScenarios {
}
