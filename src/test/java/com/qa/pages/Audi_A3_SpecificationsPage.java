package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.util.Screenshots;
import com.relevantcodes.extentreports.LogStatus;

public class Audi_A3_SpecificationsPage extends TestBase {

	@FindBy(xpath="//li[4]/a[contains(text(),'Images')]")
	WebElement A3_Car_Images_link;
	
	@FindBy(xpath="//h2[contains(text(),'Audi A3 Specifications Summary')]")
	WebElement A3_Car_SpecificationsSummary_link;
	
	
	public Audi_A3_SpecificationsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String audi_Spec_Summary(){
		return A3_Car_SpecificationsSummary_link.getText();
		 
	}
	
	public void click_Audi_A3_imagesLink() throws IOException {
		Screenshots.capture_Image();
		test.log(LogStatus.INFO, " Audi A3 car' images section is viewed");
		A3_Car_Images_link.click();
	}
	
}
