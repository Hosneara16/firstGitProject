package com.chase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithEdge {
	
	public WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
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
