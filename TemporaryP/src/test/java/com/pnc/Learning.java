package com.pnc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learning {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/a[3]")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div[2]/ul/li[5]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div[2]/ul/li[5]/ul/li[9]/a")).click();
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
		Thread.sleep(1000);
		driver.quit();
		
		
//		driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[1]/div/div[1]/div/ul[1]/li[2]/a/span")).click();
		
		

	}

}
