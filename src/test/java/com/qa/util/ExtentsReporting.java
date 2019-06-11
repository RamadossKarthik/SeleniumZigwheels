package com.qa.util;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentsReporting {

	//public static ExtentHtmlReporter ext;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	
	public static void setUpExtent() {
		if(extent == null) {
			extent = new ExtentReports("C:\\Users\\Karthick\\eclipse-workspace\\SeleniumLearnings\\target\\cucumber-reports\\cucumber-extent.html", true,DisplayOrder.OLDEST_FIRST);
			extent.loadConfig(new File("C:\\Users\\Karthick\\eclipse-workspace\\SeleniumLearnings\\src\\main\\resources\\extent-config.xml"));
			//System.out.println(extent);
			test = extent.startTest("Zigwheels", "Functionality");
		}
		
		
	}


	
	
	
}
