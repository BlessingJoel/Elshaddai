package ENetwork;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.Header;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HeaderMain {
//	long startime;
//	long Endtime;
	
	WebDriver driver;
	@BeforeTest
	public void Setup() {
//	    startime = System.currentTimeMillis();
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://enetwork.co.in/");
		 
	}
	
	@BeforeMethod
	public void OpenBrowser() {
		System.out.println("Run to method");
	}
	
	
	@Test(priority = 0,enabled = true)
	public void Home(){
		
//		driver.get("https://enetwork.co.in/");
		
		Header hd=new Header(driver);
		hd.getclickHome();
	}
	
		//Solutions
	    @Test(priority = 1,enabled = true)
		public void Solution() throws Throwable {
		Header solution=new Header(driver);
		solution.getclickSolution();
		Thread.sleep(1000);
		solution.getclickNetwork();
		String net = driver.getCurrentUrl();
		Assert.assertEquals(net,"https://enetwork.co.in/#/serversstorage");
		System.out.println("successfully run to Network");
		solution.getclickSolution();
		Thread.sleep(1000);
		solution.getclickActive();
		String Act  = driver.getCurrentUrl();
		Assert.assertEquals(Act,"https://enetwork.co.in/#/activepassive");
		System.out.println("successfully run to Active");
		solution.getclickSolution();
		Thread.sleep(1000);
		solution.getclickPassive();
		String pass  = driver.getCurrentUrl();
		Assert.assertEquals(pass,"https://enetwork.co.in/#/activepassive");
		System.out.println("successfully run to passive");
		solution.getclickSolution();
		Thread.sleep(1000);
		solution.getclickCyber();
		String cyb  = driver.getCurrentUrl();
		Assert.assertEquals(cyb,"https://enetwork.co.in/#/serversstorage");
		System.out.println("successfully run to Cyber");
		solution.getclickSolution();
		Thread.sleep(1000);
		solution.getclickData();
		String Data = driver.getCurrentUrl();
		Assert.assertEquals(Data,"https://enetwork.co.in/#/datasecurity");
		System.out.println("successfully run to Data");
		solution.getclickSolution();
		Thread.sleep(1000);
		solution.getclickNsecurity();
		String Nsecurity = driver.getCurrentUrl();
		Assert.assertEquals(Nsecurity,"https://enetwork.co.in/#/networkSecurity");
		System.out.println("successfully run to Nsecuriy");
		solution.getclickSolution();
		Thread.sleep(1000);
		solution.getclickEndpoint();
		String End = driver.getCurrentUrl();
		Assert.assertEquals(End,"https://enetwork.co.in/#/endpoint");
		System.out.println("successfully run to Endpoint");
		solution.getclickSolution();
		Thread.sleep(1000);
		solution.getclickDigital();
		String Digital = driver.getCurrentUrl();
		Assert.assertEquals(Digital,"https://enetwork.co.in/#/digitaldisplays");
		System.out.println("successfully run to Digital Displays");
		solution.getclickSolution();
		Thread.sleep(1000);
		solution.getclickVideo();
		String Video = driver.getCurrentUrl();
		Assert.assertEquals(Video,"https://enetwork.co.in/#/digitaldisplays");
		System.out.println("successfully run to Video Wall");
		solution.getclickSolution();
		Thread.sleep(1000);
		solution.getclickProjectors();
		String Projector = driver.getCurrentUrl();
		Assert.assertEquals(Projector,"https://enetwork.co.in/#/digitaldisplays");
		System.out.println("successfully run to Projectors");
		solution.getclickSolution();
		Thread.sleep(1000);
		solution.getclickInteractive();
		String Interactive = driver.getCurrentUrl();
		Assert.assertEquals(Interactive,"https://enetwork.co.in/#/digitaldisplays");
		System.out.println("successfully run to Interactive");
		solution.getclickSolution();
		Thread.sleep(1000);
		solution.getclickCommercial();
		String Commercial = driver.getCurrentUrl();
		Assert.assertEquals(Commercial,"https://enetwork.co.in/#/digitaldisplays");
		System.out.println("successfully run to Commercial");
		solution.getclickSolution();
		Thread.sleep(1000);
		solution.getclickServices();
		String Services = driver.getCurrentUrl();
		Assert.assertEquals(Services,"https://enetwork.co.in/#/services");
		System.out.println("successfully run to Services");
		solution.getclickSolution();
		Thread.sleep(1000);
		solution.getclickCamera();
		String Camera = driver.getCurrentUrl();
		Assert.assertEquals(Camera,"https://enetwork.co.in/#/services");
		System.out.println("successfully run to Camera");
		solution.getclickSolution();
		Thread.sleep(1000);
		solution.getclickPrinting();
        String Printing = driver.getCurrentUrl();
        Assert.assertEquals(Printing,"https://enetwork.co.in/#/printingsolution");
		System.out.println("successfully run to Printing");
		solution.getclickSolution();
		Thread.sleep(1000);
		solution.getclickLaser();
		String Laser = driver.getCurrentUrl();
		Assert.assertEquals(Laser,"https://enetwork.co.in/#/printingsolution");
		System.out.println("successfully run to Laser");
		solution.getclickSolution();
		Thread.sleep(1000);
		solution.getclickUser();
		String User = driver.getCurrentUrl();
		Assert.assertEquals(User,"https://enetwork.co.in/#/network");
		System.out.println("successfully run to User");
		solution.getclickSolution();
		Thread.sleep(1000);
		solution.getclickDesktop();
		String Desktop = driver.getCurrentUrl();
		Assert.assertEquals(Desktop,"https://enetwork.co.in/#/network");
		System.out.println("successfully run to Desktop");
		solution.getclickSolution();
		Thread.sleep(1000);
		solution.getclickAccess();
		String Access = driver.getCurrentUrl();
		Assert.assertEquals(Access,"https://enetwork.co.in/#/accessories");
		System.out.println("successfully run to Access");
		solution.getclickSolution();
		Thread.sleep(1000);
		solution.getclickHard();
		String Hard = driver.getCurrentUrl();
		Assert.assertEquals(Hard,"https://enetwork.co.in/#/accessories");
		System.out.println("successfully run to Hard");
	}
		
		//Software
		@Test(priority = 2,enabled = true)
		public void Software() {
			
		
		Header software=new Header(driver);
		software.getclickSoftware();
	    software.getclickDSoftware();
		String DDS  = driver.getCurrentUrl();
		Assert.assertEquals(DDS,"https://enetwork.co.in/#/softwaresolution");
		System.out.println("successfully run to DSofware");
		software.getclickSoftware();
		software.getclick3D();
		String DDS1 = driver.getCurrentUrl();
		Assert.assertEquals(DDS1,"https://enetwork.co.in/#/printer");
		System.out.println("successfully run to 3D");
		}
		@Test(priority = 3,enabled = true)
		public void Contact() throws Throwable {
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
//		driver.navigate().back();
	}
	
	@AfterMethod(enabled = true)
	public void after() {
		String URL = driver.getCurrentUrl();
		if(URL.equals("https://enetwork.co.in/#/aboutus")) {
			System.out.println("Succesfully run first method");
		}
		else if (URL.equals("https://enetwork.co.in/#/accessories")) {
			System.out.println("Succesfully run second method");
		}
		else if (URL.equals("https://enetwork.co.in/#/printer")) {
			System.out.println("Succesfully run third method");
		}
		else if(URL.equals("https://enetwork.co.in/#/contact")) {
			System.out.println("Succesfully run fourth method");
		}
		else {
			System.out.println("Succesfully method is run");
		}
	}
	
	@AfterTest(enabled = true)
	public void close() {
//	    Endtime = System.currentTimeMillis();
//		Object total = Endtime-startime;
//		System.out.println("run time :"+total);
		driver.quit();
	}
}
