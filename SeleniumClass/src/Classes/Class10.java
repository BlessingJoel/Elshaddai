package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		
		//selectByIndex
		WebElement day= driver.findElement(By.name("birthday_day"));
		Select sel=new Select(day);
		sel.selectByIndex(7);
		
		//selectByValue
		WebElement month= driver.findElement(By.id("month"));
		Select sel1=new Select(month);
		sel1.selectByValue("11");
		
		//selectByVisiblbeText
		WebElement year= driver.findElement(By.id("year"));
		Select sel2=new Select(year);
		sel2.selectByVisibleText("2000");

	}

}
