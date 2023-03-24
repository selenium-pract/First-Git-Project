package mits.SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActionsPract {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		
		WebElement name= driver.findElement(By.id("userName"));
		
		name.sendKeys("Mahesh");
		
		name.sendKeys(Keys.TAB);
		
		WebElement email=driver.findElement(By.id("userEmail"));
		
		email.sendKeys("mahesh@gmail.com");
		
		email.sendKeys(Keys.TAB);
		
		WebElement caddr=driver.findElement(By.id("currentAddress"));
		
		caddr.sendKeys("guntur, 522003");
		
		caddr.sendKeys(Keys.TAB);
		
		WebElement paddr=driver.findElement(By.id("permanentAddress"));
		
		caddr.sendKeys(Keys.CONTROL,"A");
		
		caddr.sendKeys(Keys.CONTROL,"C");
		
		paddr.sendKeys(Keys.CONTROL, "V");
		
		



	}

}
