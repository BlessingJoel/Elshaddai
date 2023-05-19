package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		
		//calendar
//		driver.get("https://www.makemytrip.com/");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//*[@class='fsw_inputBox dates inactiveWidget ']")).click();
//		
//		driver.findElement(By.xpath("(//div[text()='March']/ancestor::div[@class='DayPicker-Months']/descendant::p[text()='20'])[1]")).click();
         
		
		//drag & drop
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		WebElement to= driver.findElement(By.id("draggable"));
		WebElement from= driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.clickAndHold(to).perform();  
		act.moveToElement(from).perform();
		act.release().build().perform();
		
	}

}
