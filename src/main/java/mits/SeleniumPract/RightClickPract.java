package mits.SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickPract {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://flipkart.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement rightclick= driver.findElement(By.xpath("//a[@class='_3-PJz-']//span[contains(text(),'Become a Seller')]"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(rightclick).perform();
		
		
	}
	
	
		

}
