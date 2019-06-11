package com.qa.util;

import java.util.Set;

import com.qa.base.TestBase;

public class SwitchWindows extends TestBase { 

	public static void switchToWindow() {
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String win : allWindows ) {
			
			if(!driver.getWindowHandle().equalsIgnoreCase(win)) {
				driver.switchTo().window(win);
			}
			
		}
	}
	
	
	
	
}
