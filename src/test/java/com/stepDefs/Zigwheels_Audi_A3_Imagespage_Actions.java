package com.stepDefs;

import com.qa.base.TestBase;
import com.qa.pages.Audi_A3_Homepage;
import com.qa.pages.Audi_A3_Imagespage;
import com.qa.pages.Audi_A3_SpecificationsPage;
import com.qa.pages.Zigwheels_Audi_page;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Then;

public class Zigwheels_Audi_A3_Imagespage_Actions extends TestBase {

	
	
	
	@Then("^The user click on Exterior Images View All Link$")
	public void the_user_click_on_Exterior_Images_View_All_Link() throws Throwable {
	    
		Audi_A3_Imagespage audi_A3_Imagespage = new Audi_A3_Imagespage();
		String text = audi_A3_Imagespage.A3_Text_validation();
		test.log(LogStatus.INFO,  " The text on the screen is :" + text);
		audi_A3_Imagespage.viewAll_Click();
		test.log(LogStatus.INFO, "The Exterior Images View All link is selected");
		audi_A3_Imagespage.view_Colours_Tab();
		audi_A3_Imagespage.view_Exterior_Tab();
	}
}
