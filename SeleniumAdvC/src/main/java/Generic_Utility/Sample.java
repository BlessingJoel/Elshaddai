package Generic_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	
public static void main(String[] args) {
			
	 WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("https://docs.phptravels.com/");
      
//      webdriver_Utility us=new webdriver_Utility();
//      us.launchApplication("https://docs.phptravels.com/");

	}
}
