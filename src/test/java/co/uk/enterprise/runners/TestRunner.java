package co.uk.enterprise.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/co/uk/enterprise/features"},
        plugin = {"pretty","json:target/report.json","de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"},
        glue = {"co/uk/enterprise/stepDefinitions"}
)

public class TestRunner {
}
