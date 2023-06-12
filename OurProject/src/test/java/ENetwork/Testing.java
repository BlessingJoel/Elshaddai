package ENetwork;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.Footer;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {
	
	@Test
	public void Rework() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://enetwork.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Footer foot=new Footer(driver);
		
		foot.getread();
		String read = driver.getCurrentUrl();
		Assert.assertEquals(read, "https://enetwork.co.in/#/aboutus");
		System.out.println(read);
		
		JavascriptExecutor ja=(JavascriptExecutor)driver;
		ja.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		foot.getfirst();
		String data = driver.getCurrentUrl();
		Assert.assertEquals(data, "https://enetwork.co.in/#/serversstorage");
		System.out.println("run to one");
		
		Thread.sleep(3000);
		ja.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		foot.getseond();
		String digital = driver.getCurrentUrl();
		Assert.assertEquals(digital, "https://enetwork.co.in/#/digitaldisplays");
		System.out.println("run to second");
		
		Thread.sleep(3000);
		ja.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		foot.getthird();
		String services = driver.getCurrentUrl();
		Assert.assertEquals(services, "https://enetwork.co.in/#/services");
		System.out.println("run to third");
		
		Thread.sleep(3000);
		ja.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		foot.getfourth();
		String printing = driver.getCurrentUrl();
		Assert.assertEquals(printing, "https://enetwork.co.in/#/printingsolution");
		System.out.println("run to four");
		
		Thread.sleep(3000);
		ja.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		foot.getfifth();
		String user = driver.getCurrentUrl();
		Assert.assertEquals(user, "https://enetwork.co.in/#/network");
		System.out.println("run to five");
		
		Thread.sleep(3000);
		ja.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		foot.getsixth();
		String access = driver.getCurrentUrl();
		Assert.assertEquals(access, "https://enetwork.co.in/#/accessories");
		System.out.println("run to six");
		
		Thread.sleep(3000);
		ja.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		foot.getseventh();
		String software = driver.getCurrentUrl();
		Assert.assertEquals(software, "https://enetwork.co.in/#/softwaresolution");
		System.out.println("run to seven");
		
		Thread.sleep(3000);
		ja.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		foot.geteight();
		String d = driver.getCurrentUrl();
		Assert.assertEquals(d, "https://enetwork.co.in/#/printer");
		System.out.println("run to eight");
		
		driver.quit();
		
	}

}
