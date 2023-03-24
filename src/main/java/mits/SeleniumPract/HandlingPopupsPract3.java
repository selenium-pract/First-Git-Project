package mits.SeleniumPract;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingPopupsPract3 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("confirmButton")).click();
		
		Alert alt=driver.switchTo().alert();
		
		//alt.accept();
		
		System.out.println(alt.getText());
		
		Thread.sleep(2000);
		
		alt.dismiss();
		
	}
	
	/*public static void acceptAlert() {
		
		Alert alt=driver.switchTo().alert();
		
		alt.accept();
	}
	
	public static void dismissAlert() {
		
		Alert alt=driver.switchTo().alert();
		
		alt.dismiss();
	}
	
	public static void getText() {
		
		Alert alt=driver.switchTo().alert();
		
		alt.getText();
	}*/
		

}
