package com.application.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClassTest 
{
// class variables 
	public static WebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Automation\\Assignment\\coding_chall\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().fullscreen();
		
	}
	
//	@AfterSuite
//	public void quit()
//	{
//		driver.quit();
//	}
}
