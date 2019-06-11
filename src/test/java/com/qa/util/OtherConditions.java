package com.qa.util;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.base.*;
import com.relevantcodes.extentreports.LogStatus;

public class OtherConditions extends TestBase {

	// ********************************Explicit Wait
	// Condition**********************************

	public static void elementClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}



}
