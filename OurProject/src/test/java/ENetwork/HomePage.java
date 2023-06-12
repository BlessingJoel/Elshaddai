package ENetwork;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.Header;
import POM.Home;
import Utility.Project_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {
	WebDriver driver;
	Home h;
	Project_Utility pro;
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.navigate().to("https://enetwork.co.in/");
		h=new Home(driver);
		pro=new Project_Utility();
	}
	
	@Test(priority = 0,enabled = true)
	public void HomeData() throws Throwable {
		
		Thread.sleep(3000);
		JavascriptExecutor ja=(JavascriptExecutor)driver;
		ja.executeScript("window.scroll(0,1000)", "");
	    h.gethomedata();
	    driver.navigate().back();
		Thread.sleep(3000);
	}
	
	@Test(priority = 1,enabled = true)
	public void HomeDigital() throws Throwable {
		
		Thread.sleep(3000);
		JavascriptExecutor ja=(JavascriptExecutor)driver;
		ja.executeScript("window.scroll(0,1000)", "");
	    h.gethomedigital();
	    driver.navigate().back();
		Thread.sleep(3000);
	}
	
	@Test(priority = 2,enabled = true)
	public void HomeServices() throws Throwable {
		
		Thread.sleep(3000);
		JavascriptExecutor ja=(JavascriptExecutor)driver;
		ja.executeScript("window.scroll(0,1000)", "");
	    h.gethomeservices();
	    driver.navigate().back();
		Thread.sleep(3000);
	}
	
	@Test(priority = 3,enabled = true)
	public void HomePrint() throws Throwable {
		
		Thread.sleep(3000);
		JavascriptExecutor ja=(JavascriptExecutor)driver;
		ja.executeScript("window.scroll(0,1000)", "");
	    h.gethomeprint();
	    driver.navigate().back();
		Thread.sleep(3000);
	}
	
	@Test(priority = 4,enabled = true)
	public void HomeUser() throws Throwable {
		
		Thread.sleep(3000);
		JavascriptExecutor ja=(JavascriptExecutor)driver;
		ja.executeScript("window.scroll(0,1000)", "");
	    h.gethomeend();
	    driver.navigate().back();
		Thread.sleep(3000);
	}
	
	@Test(priority = 5,enabled = true)
	public void Home3D() throws Throwable {
		
		Thread.sleep(3000);
		JavascriptExecutor ja=(JavascriptExecutor)driver;
		ja.executeScript("window.scroll(0,1000)", "");
	    h.gethome3d();
	    driver.navigate().back();
		Thread.sleep(3000);
	}
	
	@Test(priority = 6)
	public void Moresolution() throws Exception {
		Thread.sleep(3000);
		JavascriptExecutor ja=(JavascriptExecutor)driver;
		ja.executeScript("window.scroll(0,1000)", "");
		h.getmore();
		Thread.sleep(3000);
		pro.getscrollTop(driver);
		pro.getScrolldown(driver);
		h.getsolutionfirstline();
		Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
	}
	
	@Test(enabled = false)
	public void Scroll() throws Throwable {
	  
		Thread.sleep(3000);
		JavascriptExecutor ja=(JavascriptExecutor)driver;
		ja.executeScript("window.scroll(0,1000)", "");
		
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(3000);
		Header scroll=new Header(driver);
		scroll.getclickArrow();
		
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
}

