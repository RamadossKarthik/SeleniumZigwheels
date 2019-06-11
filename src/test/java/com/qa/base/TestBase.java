package com.qa.base;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.jline.internal.Log;
import com.qa.util.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.config.*;



public class TestBase extends ExtentsReporting{
	
	public static WebDriver driver;
	public static String testCaseName;
	public static ExtentHtmlReporter htmlRep;
	/*public static ExtentReports extent;
	public static ExtentTest test;*/
	public static WebDriverWait wait;
	public static ITestResult result;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static JavascriptExecutor js;
	public static ChromeOptions options;
	
	@BeforeSuite
	public static void initializationSetUp()  {
		
		
		ExtentsReporting.setUpExtent();
		WebDriverManager.chromedriver().setup();
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, 50);
		driver.manage().window().maximize();
		DOMConfigurator.configure("C:\\Users\\Karthick\\eclipse-workspace\\SeleniumLearnings\\src\\main\\resources\\log4j.xml");
		PropertyConfigurator.configure("C:\\Users\\Karthick\\eclipse-workspace\\SeleniumLearnings\\src\\main\\resources\\log4j.properties");
		driver.get("http://zigwheels.com");
		test.setDescription("The test started");
		
		
			
	}
	
	
	
	@AfterClass
	public void tearDown() {
		extent.flush();
		driver.close();
	}

}
