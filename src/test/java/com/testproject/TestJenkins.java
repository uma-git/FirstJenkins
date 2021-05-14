package com.testproject;


	

	import org.junit.Test;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class TestJenkins {
		WebDriver driver;  
		 @Test
		    public void OpenBrowser()  {
			 WebDriverManager.chromedriver().setup();			
				driver=new ChromeDriver();
				driver.get("http://jupiter.cloud.planittesting.com/");
				System.out.println("Got the title in TestNG"+ driver.getTitle());
				driver.quit();
		    }

	}


