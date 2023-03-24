package mits.SeleniumPract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropPract {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		driver.manage().window().maximize();
		
		WebElement drag=driver.findElement(By.id("draggable"));
		
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		
		//act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		act.dragAndDrop(drag, drop).perform();//2nd way
		
		

	}

}
