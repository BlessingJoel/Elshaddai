package Classes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.javascript.host.html.Option;

public class Class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WebDriver driver=new ChromeDriver();
		
		
		//upload files
//		driver.get("https://www.foundit.in/");
//		driver.findElement(By.xpath("//*[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
//		
//		WebElement data= driver.findElement(By.id("file-upload"));
//		data.sendKeys("E:\\AJI\\Testing Documents");
//		System.out.println("upload the file");
		
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setAcceptInsecureCerts(true);
		
	
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--incognito");
//		option.merge(cap);
		WebDriver driver=new ChromeDriver(option);
		driver.get("http://www.cacert.org/");
		
		

	}

}
