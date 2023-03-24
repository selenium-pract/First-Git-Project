package mits.SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivePract {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("maheshoap@gmail.com");
		
		//driver.findElement(By.id("pass")).sendKeys("abcd@1234");
		
		//driver.findElement(By.name("login")).click();
		
		//System.out.println(driver.getTitle());
		
		//System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		//driver.findElement(By.xpath("//a[normalize-space()='Forgotten password?']")).click();
		
		driver.findElement(By.id("u_0_0_+n")).click();

	}

}
