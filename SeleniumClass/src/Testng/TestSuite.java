package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuite {
	WebDriver driver;
	long starttime;
	long endtime ;

	@BeforeTest
	public void openbrowser() {
		starttime = System.currentTimeMillis();
		driver=new ChromeDriver();
	}
	@Test(priority  =0)
	public void openGoogle() {
		driver.get("https://www.google.co.in");
	}
	@Test(priority = 1)
	public void openBing() {
		driver.get("https://www.bing.com");
	}
	@Test(priority = 2)
	public void opendYahoo() {
		driver.get("https://www.yahoo.com");
	}
	@AfterTest
	public void closebrowser() {
		driver.quit();
		endtime = System.currentTimeMillis();
		long totaltime = endtime-starttime;
		System.out.println("Google time::"+totaltime);
	}
}
