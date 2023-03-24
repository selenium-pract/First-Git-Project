package mits.SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://flipkart.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//div[@class='_331-kn _2tvxW']//div[5]//a[1]")).click();
		
		Thread.sleep(2000);
		
		WebElement element=driver.findElement(By.xpath("//span[@class='_2I9KP_ _2WDRax']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(element).perform();
		
		

	}

}
