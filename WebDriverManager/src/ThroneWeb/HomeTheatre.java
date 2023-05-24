package ThroneWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeTheatre {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.navigate().to("https://thronerecliners.com/#/");
		
		driver.findElement(By.className("close")).click();
		
		//id[1]
		WebElement first= driver.findElement(By.xpath("(//*[starts-with(@class,'col-lg-4 col-md-6')])[1]"));
		Actions f1=new Actions(driver);
		f1.moveToElement(first).perform();
	    driver.findElement(By.xpath("(//*[@title='More Details'])[1]")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        
        //id[2]
        WebElement second= driver.findElement(By.xpath("(//*[starts-with(@class,'col-lg-4 col-md-6')])[2]"));
        Actions s2=new Actions(driver);
        s2.moveToElement(second).perform();
        driver.findElement(By.xpath("(//*[@title='More Details'])[2]")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        
        //id[3]
         WebElement third= driver.findElement(By.xpath("(//*[starts-with(@class,'col-lg-4 col-md-6')])[3]"));
         Actions t3=new Actions(driver);
         t3.moveToElement(third).perform();
         driver.findElement(By.xpath("(//*[@title='More Details'])[3]")).click();
         Thread.sleep(2000);
         driver.navigate().back();
        
        

	}

}
