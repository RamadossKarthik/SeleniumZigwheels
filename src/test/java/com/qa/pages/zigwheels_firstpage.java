package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.base.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

import org.junit.Assert.*;

public class zigwheels_firstpage extends TestBase{
	
	@FindBy(xpath="//img[@alt='ZigWheels']")
	WebElement icon_Home;
	
	@FindBy(xpath="//input[@id='homeSearch']")
	public static WebElement search_textField;
	
	@FindBy(xpath="//button[@class='btn search-r-btn']")
	public static WebElement search_Button;
	
	@FindBy(xpath="//li/a[contains(text(),'New Cars')]")
	public static WebElement New_Cars_Button;
	
	
	
	
	
	
	public zigwheels_firstpage() {
		PageFactory.initElements(driver, this);
	}
	
	// searching using method 1	
	public void search_Functionality() {
		search_textField.sendKeys("Honda City");
		search_Button.click();
		
	}
	
	public void search_Cars_Using_New_Cars() {
		
		New_Cars_Button.click();
	}
	
	
	
	
	
	
	

	
	

}
