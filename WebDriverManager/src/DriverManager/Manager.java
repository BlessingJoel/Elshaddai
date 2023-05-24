package DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		WebElement to= driver.findElement(By.id("draggable"));
		WebElement from= driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.clickAndHold(to).perform();  
		act.moveToElement(from).perform();
		act.build().perform();

	}

}
//pull
//second push
