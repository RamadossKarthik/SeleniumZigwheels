package com.qa.util;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.qa.*;
import com.qa.base.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class Listeners extends ExtentsReporting implements ITestListener {

	
	
	public void onTestStart(ITestResult result) {
		
	}
	

	public void onTestSuccess(ITestResult result) {
		//log.debug(result +  " The test is passed successfully");
		test.log(LogStatus.INFO, " The test case is passed succesfully");
		extent.endTest(test);
		extent.flush();
	}

	public void onTestFailure(ITestResult result) {
		/*ExtentsReporting.setUpExtent();
		System.out.println(test);
		test.log(LogStatus.FAIL,"The test is failed successfully ");*/
		//log.debug(result + " The test is passed successfully");
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {
	
	}

}
