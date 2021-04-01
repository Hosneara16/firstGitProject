package com.chase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToChase {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//WebDriverManager.edgedriver().setup();
		//driver = new EdgeDriver();
		
		//WebDriverManager.iedriver().setup();
		//driver = new InternetExplorerDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:/Users/bafka/eclipse-workspace/Browser_Drivers/geckodriver.exe");
		//WebDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
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
	public void tearDown() {
		driver.quit();
		System.out.println("Browser closed successfully");
	}


}
