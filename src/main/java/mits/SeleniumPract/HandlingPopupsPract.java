package mits.SeleniumPract;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingPopupsPract {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("timerAlertButton")).click();
		
		Thread.sleep(5000);
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.accept();
		
		

	}

}
