package mits.SeleniumPract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("mahesh");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bandaru");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9703338341");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("test@123");
		
		Thread.sleep(2000);
		
		WebElement day=driver.findElement(By.id("day"));
		
		Select Day=new Select(day);
		
		//Day.selectByVisibleText("21");
		
		WebElement month=driver.findElement(By.id("month"));
		
		Select Month=new Select(month);
		
		Month.selectByVisibleText("Aug");
		
		WebElement year=driver.findElement(By.id("year"));
		
		Select Year=new Select(year);
		
		Year.selectByVisibleText("2022");	
		
		List<WebElement> dates= Day.getOptions();
		
		for(int i=0;i<dates.size();i++) {
			
			//System.out.println(dates.get(i).getText());
			
			String st=dates.get(i).getText();
			
			System.out.println(st);
			
			if(st.equals("11")) {
				
				Day.selectByVisibleText(st);
				
				break;
			}
		}
		
		List<WebElement> months= Month.getOptions();
		
		for(int i=0;i<months.size();i++) {
			
			System.out.println(months.get(i).getText());
		}
		
		//SelectVisibleText(day, "11");
		
		//SelectVisibleText(month, "Aug");
		
		//SelectVisibleText(year, "1993");
		
		
	}
	
	//public static void SelectVisibleText(WebElement element, String text) {
		
		//Select day=new Select(element);
		
		//day.selectByVisibleText(text);
	//}

}
