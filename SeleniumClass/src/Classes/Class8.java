package Classes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

//		driver.get("https://www.flipkart.com/");
//
//		driver.findElement(By.xpath("//*[text()='✕']")).click();
//		WebElement first = driver.findElement(By.xpath("//*[text()='Fashion']"));
//		Actions act = new Actions(driver);
//		act.moveToElement(first).perform();
//		act.contextClick(first).perform();

//		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		WebElement second = driver.findElement(By.xpath("//*[contains(text(),'Double-Click')]"));
//
//		Actions act1 = new Actions(driver);
//		act1.doubleClick(second).perform();

		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement from = driver.findElement(By.xpath("//*[text()=' 5000 ']"));
		WebElement to = driver.findElement(By.xpath("(//*[@class='placeholder'])[2]"));

		Actions act2 = new Actions(driver);

		act2.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
		//act2.dragAndDrop(from, to).build().perform();
		
//		act2.clickAndHold(from).perform();
//		act2.release(to).perform();

	}

}
