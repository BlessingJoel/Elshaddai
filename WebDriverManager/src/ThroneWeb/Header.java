package ThroneWeb;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.ConfirmHandler;
import com.gargoylesoftware.htmlunit.PromptHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Header {
    
	@Test( invocationCount = 1,threadPoolSize = 1)
	public void secondtry() throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.navigate().to("https://thronerecliners.com/#/");
		
//		driver.manage().window().maximize();
		
		Set<String> all = driver.getWindowHandles();
		driver.findElement(By.className("close")).click();
		
		//Sofas
		WebElement sofas = driver.findElement(By.xpath("(//*[text()='Sofas'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(sofas).perform();
		
		WebElement drop1 = driver.findElement(By.xpath("//*[text()='Throne classics']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(drop1).perform();
		
		driver.findElement(By.xpath("//*[text()='Marshmellow']")).click();
		
		//Home theater
		WebElement home = driver.findElement(By.xpath("//*[text()='Home Theater Recliners']"));
		Actions act2=new Actions(driver);
		act2.moveToElement(home).perform();
		driver.findElement(By.xpath("(//*[text()='Merry'])[3]")).click();
		
		//living
//		WebElement living = driver.findElement(By.xpath("//*[text()='Living Room Recliners']"));
//		Actions act3=new Actions(driver);
//		act3.moveToElement(living).perform();
//		driver.findElement(By.xpath("(//*[text()='Majestico'])[1]")).click();	
		
		
		//our company
		driver.findElement(By.xpath("//*[text()='Our Company']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		//home
		driver.findElement(By.xpath("(//*[text()='Home'])[1]")).click();

		//E-Catalogue
		driver.findElement(By.xpath("//*[text()='E-Catalogue']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		
		//customization
		WebElement cus = driver.findElement(By.xpath("(//*[@class='dropdown cursor-pointer'])[1]"));
		Actions cus1=new Actions(driver);
		cus1.moveToElement(cus).perform();
		
		driver.findElement(By.xpath("//*[text()='Accessories']")).click();
		Thread.sleep(3000);
		
	    driver.findElement(By.xpath("(//*[text()='Colours & Upholstery'])[1]")).click();
	    Thread.sleep(3000);
	    
	    //project
	    driver.findElement(By.xpath("//*[text()='Projects']")).click();
	    Thread.sleep(3000);
	    
	    //reach us
	    driver.findElement(By.xpath("(//*[@class='nav-link scrollto'])[3]")).click();
	    WebElement reach = driver.findElement(By.xpath("(//*[contains(@placeholder,'Name')])[1]"));
	    reach.sendKeys("Aji",Keys.TAB,"ajith@gamail.com",Keys.TAB,"123456788",Keys.TAB,"Tuti",Keys.TAB,"Recliners",
	    		Keys.TAB,"Worth and good quality",Keys.TAB,Keys.ENTER);
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//*[text()='FAQ']")).click();
	    Thread.sleep(3000);
	    
	    
//	    WebElement contact = driver.findElement(By.partialLinkText("+91 9790"));
//	    contact.click();
//	    Thread.sleep(3000);
//	    
//	    Actions action = new Actions(driver);
//	    action.sendKeys(Keys.ESCAPE).perform();
	    driver.quit();
	    

	    
	    }

}
