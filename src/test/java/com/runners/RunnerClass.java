package com.runners;

import java.io.File;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.runtime.model.CucumberFeature;
import com.cucumber.listener.Reporter;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.qa.base.TestBase;
//import com.vimalselvam.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;


/*//@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/jsonReports/cucumber-jsonReport.json",
		retryCount = 0, // Number of times retry should happen in case of failure
		detailedReport = true,
		detailedAggregatedReport = true,
		overviewReport = true,
		jsonUsageReport = "target/jsonReports/cucumber-jsonReport.json",
		usageReport = false,
		toPDF = true,
		//excludeCoverageTags = {"" },//Tags which need to excluded from coverage Report
		//includeCoverageTags = {"@passed" },//Tags which need to included into coverage Report
		outputFolder = "target")*/



@CucumberOptions(
		features="C:\\Users\\Karthick\\eclipse-workspace\\SeleniumLearnings\\src\\test\\java\\com\\features\\Sample.feature",//path of the feature file should be mentioned
		glue= {"com.stepDefs"},// step definition package name should be given
		//plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/cucumber-extent.html"},
		strict=true,
		dryRun=false,
		tags= {"@SearchCarsMethod2"},
		monochrome = true
		
		)

@Test
public class RunnerClass extends AbstractTestNGCucumberTests {




}


