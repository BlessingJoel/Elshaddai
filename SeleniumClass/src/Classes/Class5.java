package Classes;

import java.awt.Dimension;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://timetracker.ctepl.com/actitime/login.do");
		
		List<WebElement>  first= driver.findElements(By.xpath("//a"));
		
		int count=0;
		for (WebElement web : first) {
			System.out.println(web.getText());
			count+=1;
		}
		
		System.out.println("total no of links="+count);
	    
      
		List<WebElement>output=	driver.findElements(By.tagName("a"));
		int aji=output.size();
	
	System.out.println(aji); 
	}

}
