package com.stepDefs;


import java.util.List;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import com.aventstack.extentreports.ExtentTest;
import com.qa.base.TestBase;
import com.qa.pages.Zigwheels_NewCarspage;
import com.qa.pages.zigwheels_firstpage;
import com.qa.util.ExtentsReporting;
import com.qa.util.Listeners;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class zigwheels_NewCarspage_Actions extends TestBase {
	
	@Then("^the user searches Audi in search field and clicks on search icon$")
	public void the_user_searches_Audi_in_search_field_and_clicks_on_search_icon() throws Throwable {
	   
		Zigwheels_NewCarspage  zigwheels_Carspage = new Zigwheels_NewCarspage();
		zigwheels_Carspage.search_Functionality_Using_Headers("Audi");
	}	
}
