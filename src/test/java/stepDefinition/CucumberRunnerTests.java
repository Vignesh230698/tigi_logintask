package stepDefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    
@CucumberOptions(features = {"src/test/resources/signup.feature"}, glue = {"stepDefinition"})
    
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
    
}
