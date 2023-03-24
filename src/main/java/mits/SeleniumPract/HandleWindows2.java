package mits.SeleniumPract;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindows2 {
	
public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> obj=driver.getWindowHandles();
		
		Iterator<String> it=obj.iterator();
		
		String parentWindow=it.next();
		
		String childWindow=it.next();
		
		driver.switchTo().window(childWindow);
		
		//driver.close();
		
		driver.switchTo().window(parentWindow);
		
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
		
	}

}
