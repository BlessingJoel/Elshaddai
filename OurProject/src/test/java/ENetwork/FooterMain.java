package ENetwork;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.Footer;
import POM.Pages;
import Utility.Project_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterMain {
    WebDriver driver;
    Footer foot;
    Project_Utility web;
    Pages pg;
//    JavascriptExecutor ja;
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.manage().window().maximize();
		driver.navigate().to("https://enetwork.co.in/");
		driver.manage().window().maximize();
		web=new Project_Utility();
		foot=new Footer(driver);
		PageFactory.initElements(driver, Pages.class);
		pg=new Pages();
//		ja=(JavascriptExecutor)driver;
	}
	//DataCenter
	@Test(priority = 0,enabled = true)
	public void DataCenter(){
		
		
		foot.getfirst();
		web.getScrolldown(driver);
//		ja.executeScript("window.scroll(0,500)", "");
		
		
//		driver.findElement(By.xpath("(//*[@class='icon-outer'])[1]")).click();
//		driver.findElement(By.xpath("(//*[@class='icon-outer'])[2]")).click();
//		driver.findElement(By.xpath("(//*[@class='icon-outer'])[3]")).click();
//		driver.findElement(By.xpath("(//*[@class='icon-outer'])[4]")).click();
//		driver.findElement(By.xpath("(//*[@class='icon-outer'])[4]")).click();
		
		
		Pages.clickDCFirstElement.click();
		Pages.clickDCSecondElement.click();
		Pages.clickDCThirdElement.click();
		Pages.clickDCFourthElement.click();
		
//		ja.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
//		web.getScrollBottom(driver);
		
		foot.getseond();
	}
	//DigitalDisplays
	@Test(priority = 1,enabled = true)
	public void DigitalDisplays() throws Throwable {
		
//	JavascriptExecutor ja2=(JavascriptExecutor)driver;
//	ja.executeScript("window.scroll(0,1500)", "");
		web.getScrolldown(driver);
	
//	driver.findElement(By.xpath("(//*[@class='icon-outer'])[1]")).click();
//	driver.findElement(By.xpath("(//*[@class='icon-outer'])[2]")).click();
//	driver.findElement(By.xpath("(//*[@class='icon-outer'])[3]")).click();
//	driver.findElement(By.xpath("(//*[@class='icon-outer'])[3]")).click();
		
//		PageFactory.initElements(driver, Pages.class);
		Pages.clickDDFirstElement.click();
		Pages.clickDDSecondElement.click();
		Pages.clickDDThirdElement.click();
	
	
	Thread.sleep(3000);
//	ja.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
//	Footer foot2=new Footer(driver);
	foot.getthird();
	}
	//Services
	@Test(priority = 2,enabled = true)
	public void Services() throws Exception{
//		JavascriptExecutor ja3=(JavascriptExecutor)driver;
//		ja.executeScript("window.scroll(0,500)", "");
		web.getScrolldown(driver);
//		driver.findElement(By.xpath("(//*[contains(text(),'Camera')])[4]")).click();
//		driver.findElement(By.xpath("//*[contains(@class,'box5 animat')]")).click();
//		driver.findElement(By.xpath("//*[contains(@class,'box4 animat')]")).click();
		
//		Footer foot3=new Footer(driver);
		foot.getclickEnquiry();
		
		FileInputStream file=new FileInputStream("./src/test/resources/Contact");
		Properties pro=new Properties();
		pro.load(file);
		
	   driver.findElement(By.name("name")).sendKeys(pro.getProperty("ename"),
			   Keys.TAB,pro.getProperty("email"),
			   Keys.TAB,pro.getProperty("enumber"),
			   Keys.TAB,pro.getProperty("elocation"));
	   
	   WebElement enquiry = driver.findElement(By.name("select"));
	   Select sel=new Select(enquiry);
	   sel.selectByIndex(4);
	   sel.selectByVisibleText("Website Design & Development");
	   
	   driver.findElement(By.name("message")).sendKeys(pro.getProperty("mesg"));
	   Thread.sleep(3000);
//	   driver.findElement(By.xpath("//*[contains(text(),'Enquiry Now')]")).click();
	   driver.navigate().back();
	   
//	   JavascriptExecutor ja3=(JavascriptExecutor)driver;
//	   ja3.executeScript("window.scroll(0,500)", "");
	   web.getScrolldown(driver);
	   Thread.sleep(3000);
//	   driver.findElement(By.xpath("//*[contains(text(),'Laptop Power')]")).click();
//	   driver.findElement(By.xpath("(//*[contains(text(),'Laptop DC')])[1]")).click();
//	   driver.findElement(By.xpath("//*[contains(text(),'Battery Rep')]")).click();
//	   driver.findElement(By.xpath("(//*[contains(text(),'Laptop Key')])[1]")).click();
//	   driver.findElement(By.xpath("(//*[contains(text(),'Broken Scr')])")).click();
//	   
//	   driver.findElement(By.xpath("(//*[contains(text(),'Hard Drive U')])")).click();
//	   driver.findElement(By.xpath("(//*[contains(text(),'Hard Drive R')])")).click();
//	   driver.findElement(By.xpath("(//*[contains(text(),'Power Supply')])")).click();
//	   driver.findElement(By.xpath("(//*[contains(text(),'Laptop Keyboard')])[2]")).click();
//	   
//	   driver.findElement(By.xpath("(//*[contains(text(),'Solutions')])[21]")).click();
//	   driver.findElement(By.xpath("(//*[contains(text(),'Benefits')])[2]")).click();
	   
//	   PageFactory.initElements(driver, Pages.class);
	   Pages.clickSFirstElement.click();
	   Pages.clickSSecondElement.click();
	   Pages.clickSThirdElement.click();
	   Pages.clickSFourthElement.click();
	   Pages.clickSFifthElement.click();
	   Pages.clickSSixthElement.click();
	   Pages.clickSSeventhElement.click();
	   Pages.clickSEighthElement.click();
	   Pages.clickSNenthElement.click();
	   Pages.clickSTenthElement.click();
	   Pages.clickSEleventhElement.click();
	   
//	   driver.findElement(By.xpath("(//*[contains(text(),'Laptop Keyboard')])[2]")).click(); 
//	   driver.findElement(By.xpath("(//*[contains(text(),'Solutions')])[21]")).click();
//	   driver.findElement(By.xpath("(//*[contains(text(),'Benefits')])[2]")).click();
	   
//	   ja.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
//	   web.getScrollBottom(driver);
	   Thread.sleep(3000);
	   foot.getfourth();
	}
	@Test(priority = 3,enabled = true)
	public void Printing() throws Throwable {
		
//		JavascriptExecutor ja4=(JavascriptExecutor)driver;
//		ja.executeScript("window.scroll(0,500)", "");
		web.getScrolldown(driver);
//		driver.findElement(By.xpath("(//*[contains(text(),'Standalone for')])")).click();
//		driver.findElement(By.xpath("(//*[contains(text(),'Small Work')])")).click();
//		driver.findElement(By.xpath("(//*[contains(text(),'Medium Work')])")).click();
//		driver.findElement(By.xpath("(//*[contains(text(),'Large Enterprise')])")).click();
		
//		PageFactory.initElements(driver, Pages.class);
	    
		Pages.clickPFirstElement.click();
		Pages.clickPSecondElement.click();
		Pages.clickPThirdElement.click();
		Thread.sleep(3000);
		Pages.clickPFourthElement.click();
		
		Thread.sleep(3000);
		foot.getfifth();
	}
	
	@Test(priority = 4,enabled = true)
	public void User() throws Throwable {
		
		Thread.sleep(3000);
//		JavascriptExecutor ja=(JavascriptExecutor)driver;
//		ja.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
//		foot.getfifth();
//		Thread.sleep(3000);
//		Pages.clickUFirstElement.click();
//	    Pages.clickUSecondElement.click();
//	    Pages.clickUThirdElement.click();
//	    Pages.clickUFourthElement.click();
		pg.getUser1();
		
		Thread.sleep(3000);
		pg.getUser2();
		
		pg.getclilckCricle();
		
		pg.getUser3();
		
		pg.getUser4();
		
	}
	
	@Test(priority = 5,enabled = true)
	public void Accessories() throws Throwable {
		
//		Thread.sleep(3000);
//		web.getScrollBottom(driver);
		JavascriptExecutor ja=(JavascriptExecutor)driver;
		ja.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		
		foot.getsixth();
		Thread.sleep(3000);
		
		WebElement hard = driver.findElement(By.xpath("(//*[starts-with(text(),'Hard')])[3]"));
		web.getHover(driver, hard);
//		Thread.sleep(3000);
		
		WebElement Ram = driver.findElement(By.xpath("(//*[starts-with(text(),'RAM')])[4]"));
		web.getHover(driver, Ram);
		WebElement Laptop = driver.findElement(By.xpath("(//*[starts-with(text(),'Laptop B')])[4]"));
		web.getHover(driver, Laptop);
		WebElement Power = driver.findElement(By.xpath("(//*[starts-with(text(),'Power')])[4]"));
		web.getHover(driver, Power);
		WebElement Docking = driver.findElement(By.xpath("(//*[starts-with(text(),'Docking')])[4]"));
		web.getHover(driver, Docking);
		WebElement Keyboard = driver.findElement(By.xpath("//*[starts-with(text(),'Keyboard')]"));
		web.getHover(driver, Keyboard);
		WebElement Apple = driver.findElement(By.xpath("(//*[starts-with(text(),'Apple')])[1]"));
		web.getHover(driver, Apple);
		WebElement Cable = driver.findElement(By.xpath("//*[starts-with(text(),'Cable')]"));
		web.getHover(driver, Cable);
		WebElement Ups = driver.findElement(By.xpath("//*[starts-with(text(),'UPS')]"));
		web.getHover(driver, Ups);
		WebElement Display = driver.findElement(By.xpath("//*[starts-with(text(),'Display')]"));
		web.getHover(driver, Display);
		WebElement Speaker = driver.findElement(By.xpath("//*[starts-with(text(),'Speakers')]"));
	    web.getHover(driver, Speaker);
	}
	
	@Test(priority = 6,enabled = true)
	public void software() throws Throwable{
		
//		Thread.sleep(8000);
		
		JavascriptExecutor ja2=(JavascriptExecutor)driver;
		ja2.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		
      foot.getseventh();
      Thread.sleep(3000);
		WebElement img1 = driver.findElement(By.xpath("//*[@class='content-image2']"));
		web.getHover(driver, img1);
		WebElement img2 = driver.findElement(By.xpath("//*[@class='content-image3']"));
		web.getHover(driver, img2);
		WebElement img3 = driver.findElement(By.xpath("//*[@class='content-image4']"));
		web.getHover(driver, img3);
		WebElement img4 = driver.findElement(By.xpath("//*[@class='content-image5']"));
		web.getHover(driver, img4);
		WebElement img5 = driver.findElement(By.xpath("//*[@class='content-image6']"));
		web.getHover(driver, img5);
		Thread.sleep(3000);
	}
	
	@Test(priority = 7)
	public void printer() throws Exception {
		foot.geteight();

//		Thread.sleep(3000);
//		JavascriptExecutor ja=(JavascriptExecutor)driver;
//		ja.executeScript("window.scroll(0,2500)", "");
		Thread.sleep(3000);
		pg.getPrinterfirst();
		Thread.sleep(3000);
		WebElement img1 = driver.findElement(By.xpath("(//*[@class='object-cover rounded-lg'])[1]"));
	    web.getHover(driver, img1);
		Thread.sleep(3000);
		pg.getPrintersecond();
		Thread.sleep(3000);

		pg.getPrinterthird();
		Thread.sleep(3000);
		
		pg.getPrinterfourth();
		Thread.sleep(3000);
	}
	@AfterTest(enabled = true)
	public void close() {
		driver.quit();
	}
}
