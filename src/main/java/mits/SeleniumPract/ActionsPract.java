package mits.SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsPract {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		WebElement username= driver.findElement(By.id("email"));
		
		WebElement password=driver.findElement(By.id("pass"));
		
		WebElement login=driver.findElement(By.name("login"));
		
		Actions act=new Actions(driver);
		
		act.sendKeys(username,"abcd@gmail.com").perform();
		 
		act.sendKeys(password,"abcd@1234").perform();
		
		act.click(login).perform();
		
		
		
		
		


	}

}
