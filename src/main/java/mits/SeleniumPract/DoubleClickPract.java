package mits.SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickPract {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://flipkart.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
		WebElement doubleclick=driver.findElement(By.xpath("//div[@class='_3JHi0r']//p[contains(text(),'Clove Embassy Tech Village,')]"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(doubleclick).perform();
		
		
	}

}
