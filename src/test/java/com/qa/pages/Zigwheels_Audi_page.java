package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.util.Screenshots;
import com.relevantcodes.extentreports.LogStatus;

public class Zigwheels_Audi_page extends TestBase {

	
	
	@FindBy(xpath="//div[@class='popular-india mt-20']//a[@class='gscr_lSNext']")
	WebElement Audi_A3_slider;
	
	@FindBy(xpath="//div[contains(text(),'Audi A3')]")
	WebElement Audi_A3_Link;
	
	

	public Zigwheels_Audi_page() {
		PageFactory.initElements(driver, this);
	}
	
	public String get_Title_Audi_Page() {
		String Audi_page_title = driver.getTitle();
		return Audi_page_title;
	}
	
	
	
	public void click_Audi_A3() throws IOException {
		Screenshots.capture_Image();
		Audi_A3_slider.click();
		Screenshots.capture_Image();
		test.log(LogStatus.INFO, " Audi A3 car is clicked");
		Audi_A3_Link.click();
		//return new Audi_A3_Homepage();
	}
}
