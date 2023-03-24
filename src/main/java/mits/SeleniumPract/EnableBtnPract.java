package mits.SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnableBtnPract {
	
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement name= driver.findElement(By.xpath("//input[@name='username']"));
		
		name.sendKeys("Admin");
		
		WebElement pwd= driver.findElement(By.xpath("//input[@name='password']"));
		
		pwd.sendKeys("admin123");
		
		//driver.findElement(By.id("btnLogin")).click();


	}


}
