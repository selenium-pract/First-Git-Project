package mits.SeleniumPract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLinksPract {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://amazon.in");
		
		WebElement searchText= driver.findElement(By.id("twotabsearchtextbox"));
		
		searchText.click();
		
		searchText.sendKeys("Apple mobiles");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) {
			
			String text=links.get(i).getText();
			
			System.out.println(text);
		}
		



	}

}
