package Classes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://www.leafground.com/input.xhtml");
//		
//		//relative xpath
//		WebElement first= driver.findElement(By.xpath("//*[@value='Chennai']"));
//		first.clear();
//		first.sendKeys("joel");
//		
//		WebElement second=driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']"));
//		second.sendKeys("star");
//		
//		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
//		
//		driver.findElement(By.xpath("//*[@name='txtUsername'][@id='txtUsername']"))
//		.sendKeys("Ajith");
//		
//		driver.findElement(By.xpath("//*[contains(@name,'Password')]")).sendKeys("AJ");
//		
//		driver.findElement(By.xpath("//*[starts-with(@type,'sub')]")).click();
		
		
		//isEnabled
//		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
//		
//		WebElement display= driver.findElement(By.xpath("//*[contains(@name,'Submit')]"));
//		if(display.isEnabled()) {
//			display.sendKeys("AJ");
//		}
//		else {
//			System.out.println("not enable");
//		}
		driver.get("https://www.leafground.com/input.xhtml");
		WebElement first= driver.findElement(By.xpath("//*[contains(text(),'Verify ')]"));
		String output=first.getTagName();
		System.out.println(output);
		
	}
}

