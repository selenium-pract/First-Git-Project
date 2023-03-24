package mits.SeleniumPract;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlePopupsPract {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alertButton")).click();
		
		Alert alt=driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		System.out.println(alt.getText());
		
		alt.accept();

	}

}
