package mits.SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsPract {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("maheshoap@gmail.com");
		
		//driver.findElement(By.cssSelector("#pass")).sendKeys("abcd@1234");
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("maheshoap@gmail.com");
		
		//driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("abcd@1234");
		
		//driver.findElement(By.tagName("button")).click();
		
		driver.findElement(By.linkText("Forgotten password?")).click();
	}

}
