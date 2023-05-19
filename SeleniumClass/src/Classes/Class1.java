package Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
//		driver.get("https://www.youtube.com/");
		
//		maximize screen
		driver.manage().window().maximize();
		
//		minimize screen
//		driver.manage().window().minimize();
		
//		Title the webpage:
		String title=driver.getTitle();
		System.out.println("Web page title:"+title);
//		To get current url of the application:
		String output=driver.getCurrentUrl();
		System.out.println("url="+output);
		
//		prints sourcecode in page
		String output1=driver.getPageSource();
		System.out.println(output1);
		
		
//		close method closes the current forcing window
//		driver.close();
		
		
//		quit method closes all the windows
//		driver.quit();
	
		
	}

}
