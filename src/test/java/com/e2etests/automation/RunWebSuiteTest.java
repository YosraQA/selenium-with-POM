package com.e2etests.automation;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/spec/features"},
		plugin={"pretty", "html:target/cucumber-report.html", "json:reportJSON/cucumber.json"},
		tags = ("@authentification"),
		monochrome = true,
		snippets = CAMELCASE
		)

public class RunWebSuiteTest {

}