package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://timetracker.ctepl.com/actitime/login.do");
		
		driver.manage().window().maximize();
		
		//Loginpage form fill
		driver.findElement(By.name("username")).sendKeys("Ajith");
		driver.findElement(By.name("pwd")).sendKeys("Ajijeni");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.id("loginButton")).click();
		
		//sendkeys
		driver.get("https://www.amazon.in/");
		WebElement data= driver.findElement(By.id("twotabsearchtextbox"));
		data.sendKeys("lining bat");
		data.submit();
	}

}
