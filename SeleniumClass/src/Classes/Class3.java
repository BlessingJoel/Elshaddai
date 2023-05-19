package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		//Links
//		driver.get("https://in.lining.studio/");
		
		//Linktext
//		driver.findElement(By.linkText("BADMINTON")).click();
		
		
		//Partiallinktext
//		driver.findElement(By.partialLinkText("BAD")).click();
		
		//CssSeletor
		driver.get("http://190.210.184.180/login.do");
		
		//CssSelector without htmltag
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Aswin");
		//CssSeletor within htmltag
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("123456");
		
		

	}

}
