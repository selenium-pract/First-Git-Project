package mits.SeleniumPract;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindows {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		
		WebElement element= driver.findElement(By.id("tabButton"));
		
		element.click();
		
		Thread.sleep(2000);
		
		System.out.println(element.getText());
		
		
		


		
		
	}

}
