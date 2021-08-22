package simpleStart.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        tags = "@Test",
        glue = {"simpleStart/stepDefinitions"},
        plugin = {"pretty"})
public class RunTests {
}
