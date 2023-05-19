package Classes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Class13 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
			
//		Thread.sleep(3000);
//		
//		driver.findElement(By.linkText("Tasks")).click();
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("(//*[@class='selection'])[2]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//*[text()='Delete'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='popup_menu_icon'])[2]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Types of Work")).click();
		
		driver.findElement(By.id("ext-gen7")).click();
		
		driver.findElement(By.id("name")).sendKeys("Aji");
		driver.findElement(By.xpath("(//*[@type='button'])[1]")).click();
		
		Alert alt=driver.switchTo().alert();
		String output=alt.getText();
		System.out.println(output);
		
		alt.accept();
		
		
        
		

		

	}

}
