package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.util.Screenshots;
import com.relevantcodes.extentreports.LogStatus;

public class Audi_A3_Homepage extends TestBase {

	@FindBy(xpath="//a [contains(text(),'All Specifications')]")
	WebElement A3_Spec_link;
	
	public Audi_A3_Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public void click_Audi_A3_SpecLink() throws IOException {
		Screenshots.capture_Image();
		test.log(LogStatus.INFO, " Audi A3 car' specification is viewed");
		A3_Spec_link.click();
	}
	
}
