package com.stepDefs;


import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import com.aventstack.extentreports.ExtentTest;
import com.qa.base.TestBase;
import com.qa.pages.zigwheels_firstpage;
import com.qa.util.ExtentsReporting;
import com.qa.util.Listeners;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class zigwheels_firstpage_Actions extends TestBase {
	
	/*zigwheels_firstpage first;
	
	@Before
	public void setUp() {
		first = new zigwheels_firstpage();
	}
	*/
	
	@Given("^The browser is launched$")
	public void the_browser_is_launched(){
	    TestBase.initializationSetUp();
	   
	    System.out.println(result);
	    ExtentsReporting.setUpExtent();
		System.out.println(test);
		
	}

	@Then("^The user views the home screen and searches the desired car$")
	public void the_user_views_the_home_screen_and_searches_the_desired_car() {
		
		zigwheels_firstpage first =  new zigwheels_firstpage();
		first.search_Functionality();
		test.log(LogStatus.INFO	, "The user is searching the cars using the search option in home screen");
		
	}
	
	@Then("^The user views the home screen and searches the desired car using New Cars option$")
	public void the_user_views_the_home_screen_and_searches_the_desired_car_using_option() throws Throwable {
	
		zigwheels_firstpage first =  new zigwheels_firstpage();
		first.search_Cars_Using_New_Cars();
		test.log(LogStatus.INFO	, "The user is searching the cars after clicking on New Cars option ");
	}
	
	
	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			byte[] screenshotBytes = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotBytes, "C:\\Users\\Karthick\\eclipse-workspace\\SeleniumLearnings\\src\\test\\resources");
			
		}
	}
	
}
