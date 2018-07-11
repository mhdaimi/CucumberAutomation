package com.syne.basic.sharingDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharingDriver {
	private static WebDriver driver;
	
	public static WebDriver getDriver(){
		
		if(driver == null){
			try{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\mohammad.daimi\\Cucumber\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("opned browser");
			Thread.sleep(5000);
			} catch (Exception e){
				
				System.out.println("In exception");
			}
		}
		return driver;
	}

}
