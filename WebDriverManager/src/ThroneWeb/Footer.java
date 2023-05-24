package ThroneWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Footer {
   
	@Test
	public void firsttry() throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.navigate().to("https://thronerecliners.com/#/");
		
		driver.findElement(By.id("close")).click();
		
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),' info@')]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		//click About us
		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'footer\']/div[1]/div/div[1]/div[3]/ul/li[2]/a")).click();
	    Thread.sleep(3000);
	    driver.quit();
	}

}
	