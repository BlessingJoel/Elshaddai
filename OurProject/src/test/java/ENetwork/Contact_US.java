package ENetwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.Header;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Contact_US {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://enetwork.co.in/");
	}
	
	
	@Test(priority = 0,enabled = true)
	public void openPage() throws Throwable {
	    
		
       	Header con=new Header(driver);
		con.getclickContact();
		
		FileInputStream file=new FileInputStream("./src/test/resources/Contact");
		Properties pro=new Properties();
		pro.load(file);
		
		driver.findElement(By.name("name")).sendKeys(pro.getProperty("name"),
				Keys.TAB,pro.getProperty("mail"),
				Keys.TAB,pro.getProperty("number"),
				Keys.TAB,pro.getProperty("address"),
				Keys.TAB,pro.getProperty("mesg"));
//		driver.findElement(By.xpath("//*[contains(text(),'Submit now')]")).click();
		driver.navigate().back();
	}
	
	@Test(priority = 1,enabled = true)
	public void contactPop() throws Throwable {
		Header pop=new Header(driver);
		pop.getclickContactPop();
		
		FileInputStream pfile=new FileInputStream("./src/test/resources/Contact");
		Properties ppro=new Properties();
		ppro.load(pfile);
		
		driver.findElement(By.xpath("//*[contains(@name,'name')]")).sendKeys
		         (ppro.getProperty("name")
				,Keys.TAB,ppro.getProperty("mail"),
				Keys.TAB,ppro.getProperty("mesg")
				);
		driver.findElement(By.xpath("//*[contains(text(),' Send')]")).click();
//		driver.navigate().refresh();
	}
	@AfterTest(enabled = false)
  public void close() {
	 driver.quit();
  }

}
