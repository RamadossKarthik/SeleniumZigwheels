package com.stepDefs;

import com.qa.base.*;
import com.qa.pages.Audi_A3_Homepage;
import com.qa.pages.Audi_A3_SpecificationsPage;
import com.qa.pages.Zigwheels_Audi_page;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Then;

public class Zigwheels_Audi_A3_SpecificationsPage_Actions extends TestBase {

	@Then("^The user clicks on images link$")
	public void The_user_clicks_on_images_link() throws Throwable {
	   
		Audi_A3_SpecificationsPage audi_A3_SpecificationsPage = new Audi_A3_SpecificationsPage();
		String text_OnPage = audi_A3_SpecificationsPage.audi_Spec_Summary();
		test.log(LogStatus.INFO	, " The text on screen is :" + text_OnPage);
		audi_A3_SpecificationsPage.click_Audi_A3_imagesLink();
		
		
	}	
	
	
}
