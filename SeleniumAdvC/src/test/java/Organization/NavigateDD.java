package Organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateDD {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		String old = driver.getWindowHandle();
		FileInputStream file=new FileInputStream("./src/test/resources/commondata");
		Properties pro=new Properties();
		pro.load(file);
		
		String URl = pro.getProperty("url");
		
		driver.get(URl);
		driver.findElement(By.name("user_name")).sendKeys(pro.getProperty("name"),
				Keys.TAB,pro.getProperty("password"),Keys.TAB.ENTER);
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//*[@title='Create Organization...']")).click();
		
		WebElement drop = driver.findElement(By.name("industry"));
		Select sel=new Select(drop);
//        sel.selectByVisibleText("Healthcare");
		sel.selectByValue("Healthcare");
		
//		driver.findElement(By.name("industry")).click();
//		driver.findElement(By.xpath("(//*[contains(text(),'Utilities')])[2]")).click();
//		driver.findElement(By.name("industry")).click();
	}

}
