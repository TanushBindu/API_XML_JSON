package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Featuress",
glue="Step_Definition1",monochrome = true)
public class TestRunner
{
}