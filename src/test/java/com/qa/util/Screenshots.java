package com.qa.util;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.qa.*;
import com.qa.base.TestBase;



public class Screenshots extends TestBase {
	
	public static Date d;
	
	
	public static void capture_Image() throws IOException{
		
		d = new Date();
		
		String value_Date = d.toString().replace(":", "_").replace(" ", "_");
		//System.out.println(value_date);

		String name = value_Date + ".png";
		File a = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(a, new File("C:\\Users\\Karthick\\eclipse-workspace\\SeleniumLearnings\\src\\test\\resources\\" +name) );
		
	}
}
