package mits.SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrames {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("content");
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("main");
		
		String text=driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText();
		
		System.out.println(text);

		
		

	}

}
