package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureOutline", glue = { "StepDefinitionOutline" })
public class RunnerOutline {

}
