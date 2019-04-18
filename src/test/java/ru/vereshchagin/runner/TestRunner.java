package ru.vereshchagin.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/ru/vereshchagin/features",
        glue = "stepsPack",
        tags = "@logintest"
)

public class TestRunner {
}
