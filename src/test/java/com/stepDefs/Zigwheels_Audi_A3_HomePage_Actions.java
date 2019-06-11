package com.stepDefs;

import com.qa.pages.Audi_A3_Homepage;
import com.qa.pages.Audi_A3_SpecificationsPage;
import com.qa.pages.Zigwheels_Audi_page;
import cucumber.api.java.en.Then;

public class Zigwheels_Audi_A3_HomePage_Actions {

	@Then("^The user clicks on All Specifications link of Audi A3 car$")
	public void The_user_clicks_on_All_Specifications_link_of_Audi_A3_car() throws Throwable {
	   
		Audi_A3_Homepage audi_A3_Homepage = new Audi_A3_Homepage();
		audi_A3_Homepage.click_Audi_A3_SpecLink();
		
	}	
	
	
}
