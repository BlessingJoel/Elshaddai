package DataDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
//		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
//		Screen s=new Screen();
//		Pattern img=new Pattern("\"C:\\Users\\This-Pc\\OneDrive\\Pictures\\dots.png\"");
//		s.click(img);
//		Pattern img1=new Pattern("");	
//		s.click(img1);
  }
}
