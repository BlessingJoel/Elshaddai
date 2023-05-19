package Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://timetracker.ctepl.com/actitime/login.do");
		
		WebElement name= driver.findElement(By.name("username"));
		WebElement pass= driver.findElement(By.name("pwd"));
	    WebElement login= driver.findElement(By.id("loginButton"));
		
		Actions act=new Actions(driver);
		act.sendKeys(name,"Aji").perform();
		act.sendKeys(pass,"AJ").perform();
		act.sendKeys(login).perform();
		
		//act.sendKeys(name,"ajith").sendKeys(pass,"AJ").sendKeys(login).perform();

	}

}
