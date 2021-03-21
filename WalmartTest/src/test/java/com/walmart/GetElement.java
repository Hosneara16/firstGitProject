package com.walmart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetElement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.walmart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("query")).sendKeys("Clothes");
		driver.findElement(By.xpath("//*[@id=\"global-search-submit\"]/span/img")).click();
		String nUrl = driver.getCurrentUrl();
		System.out.println(nUrl);
		//driver.navigate().to("https://www.yahoo.com/");
		driver.navigate().back();
		nUrl = driver.getCurrentUrl();
		System.out.println(nUrl);
		driver.navigate().forward();
		nUrl = driver.getCurrentUrl();
		System.out.println(nUrl);
		driver.navigate().refresh();
//		driver.close();
		
	}

}
