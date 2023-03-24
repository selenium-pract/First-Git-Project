package mits.SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextAndGetAttributePract {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		String text=driver.findElement(By.className("_8eso")).getText();
		
		System.out.println(text);
		
		WebElement element= driver.findElement(By.id("email"));
		
		element.sendKeys("maheshoap@gmail.com");
		
		System.out.println(element.getAttribute("value"));
		
		String st=element.getAttribute("class");
		
		System.out.println(st);



	}

}
