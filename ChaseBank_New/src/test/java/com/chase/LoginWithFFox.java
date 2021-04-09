package com.chase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithFFox {
	
	public WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:/Users/bafka/eclipse-workspace/Browser_Drivers/geckodriver.exe");
		//WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		}
	
	@Test
	public void chaseTitle() {
		driver.get("https://www.chase.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Credit Card, Mortgage, Banking, Auto | Chase Online | Chase.com")) {
			System.out.println("We are in Chase homepage");
		}else {
			System.out.println("We are not in Chase homepage");
		}
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}



}
