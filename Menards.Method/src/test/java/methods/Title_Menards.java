package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Title_Menards {
	
	public static WebDriver driver;  //Static/Instance variable
	public String name = "Mili";  //non-Static variable
	
	@BeforeTest
	public static void openBrowser() {     //Static method
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
	
	
	@Test(priority=2)
	public void getTitle() {		//non-Static method
		driver.get("https://www.menards.com/main/home.html");
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=1)
	public void deleteCookie() {
	driver.manage().deleteAllCookies();
	maximize();
	}
	
	public void maximize() {
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public static void tearDown() {  //Static/Instance method
		Title_Menards obj=new Title_Menards();
		driver.quit();
		
		System.out.println(obj.name + "'s script closed the browser");
		
	}

	

}
