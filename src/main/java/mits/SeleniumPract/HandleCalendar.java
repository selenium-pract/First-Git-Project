package mits.SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCalendar {

	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		selectFutureDate("February 2033", "30");
	}
	
	public static void selectFutureDate(String ExpMonthAndYear, String day) {
		
		if(Integer.parseInt(day)>31) {
			
			System.out.println("Invalid month");
			
			return;
		}
		
		if(ExpMonthAndYear.contains("February") && Integer.parseInt(day)>29) {
			
			System.out.println("Invalid month");
			
			return;
		}
		
		String currentDate=driver.findElement(By.className("ui-datepicker-title")).getText();
		
		System.out.println(currentDate);
		
		while(!currentDate.equalsIgnoreCase(ExpMonthAndYear)) {
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			currentDate=driver.findElement(By.className("ui-datepicker-title")).getText();
		}
		
		selectDay(day);
	}
	
	public static void selectDay(String day) {
		
		driver.findElement(By.xpath("//a[text()='\"+day+\"']")).click();
	}

}
