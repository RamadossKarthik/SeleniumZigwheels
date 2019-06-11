package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class Zigwheels_NewCarspage extends TestBase{

	@FindBy(xpath="//input[@id='headerSearch']")
	WebElement Header_Search_Cars;
	
	@FindBy(xpath="//span[@class='h-s-v1 h-srh-i abs i-b c-p']")
	WebElement Header_Search_Cars_icon;
	
	

	public Zigwheels_NewCarspage() {
		PageFactory.initElements(driver, this);
	}
	
	public void search_Functionality_Using_Headers(String Cars ) {
		
		test.log(LogStatus.INFO, " The desired car is entered in the required search section");
		Header_Search_Cars.sendKeys(Cars);
		Header_Search_Cars_icon.click();
		
	}
	
}
