package com.qa.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.qa.base.TestBase;
import com.qa.util.OtherConditions;
import com.qa.util.Screenshots;
import com.qa.util.SwitchWindows;
import com.relevantcodes.extentreports.LogStatus;

public class Audi_A3_Imagespage extends TestBase {

	@FindBy(xpath="//h2[contains(text(),'A3 Exterior Images')]")
	WebElement A3_ExteriorImage_Text;
	
	@FindBy(xpath="//li[contains(text(),'Colours')]")
	WebElement A3_Colours_TabLink;
	
	@FindBy(xpath="//li[contains(text(),'Exterior ')]")
	WebElement A3_Exterior_TabLink;
	
	@FindBy(xpath="//li[contains(text(),'Interior')]")
	WebElement A3_Interior_TabLink;
	
	@FindBy(xpath="//li[contains(text(),'Videos ')]")
	WebElement A3_Videos_TabLink;
	
	@FindBy(xpath="//div[@class='pull-left bodyLeft']/div[3]//ul//li[6]/a/span/em[contains(text(),'View All')]")
	WebElement A3_ExteriorImage_ViewLink;
	
	
	//*******************************ACTIONS DEFINED BELOW***************************************
	
	public Audi_A3_Imagespage() {
		PageFactory.initElements(driver, this);
	}
	
	public String A3_Text_validation() throws IOException {
		Assert.assertEquals(A3_ExteriorImage_Text.getText(), "A3 Exterior Images");
		return A3_ExteriorImage_Text.getText();
	}
	
	public void viewAll_Click() throws IOException, InterruptedException {
		
		A3_ExteriorImage_ViewLink.click();
		System.out.println(driver.getWindowHandle());
		SwitchWindows.switchToWindow();
		Thread.sleep(2000);
				
	}
	
	public void view_Colours_Tab() throws InterruptedException, IOException {
		OtherConditions.elementClickable(A3_Colours_TabLink);
				
		WebElement carsCount = driver.findElement(By.xpath("//div[contains(text(),'( 1 of 5 )')]"));
		WebElement sliderColour = driver.findElement(By.xpath("//div[@id='color_slide']//*[@class='gscr_lSAction']/a[2]"));
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid blue;');",carsCount);

		Thread.sleep(300);

		do {
			Thread.sleep(300);
			Screenshots.capture_Image();
			test.log(LogStatus.INFO, "This colours image screenshot is captured");
			if (!sliderColour.isDisplayed()) {
				break;
			}
			sliderColour.click();
		} while (sliderColour.isEnabled());

	}
	
	
	
	public void view_Exterior_Tab() throws InterruptedException, IOException {
		OtherConditions.elementClickable(A3_Exterior_TabLink);
				
		WebElement sliderColour = driver.findElement(By.xpath("//div[@id='ext_slide']//*[@class='gscr_lSAction']/a[2]"));
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid blue;');",sliderColour);

		//Thread.sleep(300);
		
		try {
			do {
				Thread.sleep(300);
				Screenshots.capture_Image();
				test.log(LogStatus.INFO, "This colours image screenshot is captured");
				if (!sliderColour.isDisplayed()) {
					break;
				}
				sliderColour.click();
			} while (sliderColour.isEnabled());

		}catch(ElementClickInterceptedException e) {
				Actions act = new Actions(driver);
				act.click(sliderColour);
		}
		
	
	}
	
	
	
}
