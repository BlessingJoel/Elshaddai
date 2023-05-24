package DriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThroneWeb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();



		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		//		driver.manage().window().maximize();
		driver.navigate().to("https://thronerecliners.com/#/");

		//		driver.findElement(By.id("close")).click();
		//		driver.findElement(By.id("name")).sendKeys("ajith",Keys.TAB,"ajithudangudi@mail.com",Keys.TAB,"9940757239");
		//		WebElement select= driver.findElement(By.id("state"));
		//		
		//		select.click();
		//		
		//		Select sel=new Select(select);
		//		sel.selectByVisibleText("Tamil Nadu");
		//		
		//		WebElement select1= driver.findElement(By.id("city"));
		//		Select sel1=new Select(select1);
		//		
		//		sel1.selectByVisibleText("Thoothukudi (Tuticorin)");
		//		
		//		WebElement select2= driver.findElement(By.id("selectoption"));
		//		Select sel2=new Select(select2);
		//		
		//		sel2.selectByVisibleText("Cinema Seatings");
		//		
		//		driver.findElement(By.xpath("//*[text()='Submit']")).click();


		//		driver.manage().window().maximize();
		driver.findElement(By.className("close")).click();

		//		Thread.sleep(3000);
        
		//Home Theater
		WebElement first= driver.findElement(By.xpath("(//*[starts-with(@class,'col-lg-4 col-md-6')])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(first).perform();
		driver.findElement(By.xpath("(//*[@title='More Details'])[1]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		//Living Room
		driver.findElement(By.xpath("//*[contains(text(),' Room Recliner ')]")).click();
		
		WebElement second= driver.findElement(By.xpath("(//*[text()='Majestic'])[4]"));
		Actions act1=new Actions(driver);
		act1.moveToElement(second).perform();
		driver.findElement(By.xpath("(//*[@title='More Details'])[1] ")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		//cinema Seating
		driver.findElement(By.xpath("//*[text()=' Cinema Seatings ']")).click();
		
		WebElement third= driver.findElement(By.xpath("(//*[@class='portfolio-wrap'])[3]"));
		Actions act2=new Actions(driver);
		act2.moveToElement(third).perform();
		driver.findElement(By.xpath("(//*[@title='More Details'])[3]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		//Lounger
	    driver.findElement(By.xpath("//*[text()=' Lounger Recliners ']")).click();
		
		WebElement four= driver.findElement(By.xpath("(//*[@class='portfolio-info'])[1]"));
	    Actions act3=new Actions(driver);
		act3.moveToElement(four).perform();
		driver.findElement(By.xpath("(//*[@title='More Details'])[1]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		//Sofas
		driver.findElement(By.xpath("//*[text()=' Throne Sofas ']")).click();
		
//		WebElement scroll = driver.findElement(By.xpath("(//*[text()='Micro S'])[2]"));
//		JavascriptExecutor executor=(JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].scrollIntoView(true);", scroll);
//		Thread.sleep(3000);
		WebElement five = driver.findElement(By.xpath("(//*[text()='Micro S'])[2]"));
		Actions act4=new Actions(driver);
		act4.moveToElement(five).perform();
		
		
		






	}

}
