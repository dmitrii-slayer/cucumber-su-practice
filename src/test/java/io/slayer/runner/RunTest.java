package io.slayer.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(
        glue = {"io.slayer.stepdefs", "io.slayer.typeregistry", "io.slayer.hooks"},
//        glue = "io.slayer.stepdefs",
        features = "src/test/resources/features/")
@RunWith(Cucumber.class)
public class RunTest {
}
