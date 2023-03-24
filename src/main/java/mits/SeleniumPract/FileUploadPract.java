package mits.SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPract {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		WebElement element=driver.findElement(By.name("upfile"));
		
		element.sendKeys("C:\\Users\\LENOVO\\Desktop\\Mahesh Automation Resume.docx");


	}

}
