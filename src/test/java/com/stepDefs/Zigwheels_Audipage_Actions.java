package com.stepDefs;

import com.qa.pages.Zigwheels_Audi_page;
import cucumber.api.java.en.Then;

public class Zigwheels_Audipage_Actions {

	@Then("^The user clicks on Audi A3 car$")
	public void The_user_clicks_on_Audi_A3_car() throws Throwable {
	   
		Zigwheels_Audi_page zigwheels_Audi_page = new Zigwheels_Audi_page();
		zigwheels_Audi_page.click_Audi_A3();
	}	
	
	
}
