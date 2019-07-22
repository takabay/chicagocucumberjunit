package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberReports",//this is optional will generate default report
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
                 },
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@datatableSO",
        dryRun = false
)
public class Runner {
}