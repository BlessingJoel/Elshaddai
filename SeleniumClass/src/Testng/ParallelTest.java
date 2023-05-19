package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	
	@Test
	public void google() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://thronerecliners.com/#/");
	}
	@Test
    public void bing() {
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://thronerecliners.com/#/");
    }
}
