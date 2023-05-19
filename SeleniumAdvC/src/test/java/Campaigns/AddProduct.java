package Campaigns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddProduct {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		String handle1 = driver.getWindowHandle();
		FileInputStream file=new FileInputStream("./src/test/resources/commondata");
		Properties pro=new Properties();
		pro.load(file);
		
		String URL = pro.getProperty("url");
		driver.get(URL);
		
		driver.findElement(By.name("user_name")).sendKeys(pro.getProperty("name"),Keys.TAB,pro.getProperty("password"),
				Keys.TAB.ENTER);
		WebElement hover = driver.findElement(By.xpath("(//*[@href='javascript:;'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(hover).perform();
		driver.findElement(By.name("Campaigns")).click();
		driver.findElement(By.xpath("(//*[starts-with(@style,'padding-right:0px;')])[1]")).click();
		driver.findElement(By.name("campaignname")).sendKeys("Jack");
		driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/table/tbody/"
				+ "tr/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[4]/img")).click();

		Set<String> handle= driver.getWindowHandles();
		
		
		Iterator<String> id = handle.iterator();
		while(id.hasNext()) {
			 String wid = id.next();
			driver.switchTo().window(wid);
		}
		
//		for (String newWindow : handle) {
//			driver.switchTo().window(newWindow);
//		}
		
		driver.findElement(By.name("search_text")).sendKeys("Aji38");
		
		driver.findElement(By.name("search")).click();
		driver.findElement(By.xpath("//*[text()='Aji38']")).click();
		
		driver.switchTo().window(handle1);
		driver.findElement(By.name("button")).click();
		

	}

}
