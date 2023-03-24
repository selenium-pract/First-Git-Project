package mits.SeleniumPract;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingPopupsPract4 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("promtButton")).click();
		
		Thread.sleep(2000);
		
		enterTextintoAlert("mahesh123");
		
		acceptAlert();
		
	}
	
	public static void acceptAlert() {
		
		Alert alt=driver.switchTo().alert();
		
		alt.accept();
	}
	
	public static void enterTextintoAlert(String text) {
		
		Alert alt=driver.switchTo().alert();
		
		alt.sendKeys(text);
		
	}
}
