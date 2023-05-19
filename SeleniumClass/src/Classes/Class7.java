package Classes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class7 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://timetracker.ctepl.com/actitime/login.jsp");
//       driver.findElement(By.name("username")).sendKeys("username",Keys.TAB,"aji",Keys.ENTER);
//     WebElement pass=  driver.findElement(By.name("pwd"));
//     pass.sendKeys("Aji");
//     pass.sendKeys(Keys.ENTER);
       
       //check box click fuction
//       driver.findElement(By.name("username")).sendKeys("username",Keys.TAB,"aji",Keys.TAB,Keys.SPACE);
       
       
       driver.findElement(By.name("username")).sendKeys("Ajith");
       
       driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
       
       Robot rot=new Robot();
       
       rot.keyPress(KeyEvent.VK_CONTROL);
       rot.keyPress(KeyEvent.VK_A);
       rot.keyRelease(KeyEvent.VK_A);
       rot.keyRelease(KeyEvent.VK_CONTROL);
       
       
       rot.keyPress(KeyEvent.VK_CONTROL);
       rot.keyPress(KeyEvent.VK_C);
       rot.keyRelease(KeyEvent.VK_C);
       rot.keyRelease(KeyEvent.VK_CONTROL);
       
       rot.keyPress(KeyEvent.VK_TAB);
       rot.keyRelease(KeyEvent.VK_TAB);
       
       rot.keyPress(KeyEvent.VK_CONTROL);
       rot.keyPress(KeyEvent.VK_V);
       rot.keyRelease(KeyEvent.VK_V);
       rot.keyRelease(KeyEvent.VK_CONTROL);
       
       rot.keyPress(KeyEvent.VK_TAB);
       rot.keyRelease(KeyEvent.VK_TAB);
       
       rot.keyPress(KeyEvent.VK_SPACE);
      
       rot.keyRelease(KeyEvent.VK_SPACE);
       
       rot.keyPress(KeyEvent.VK_TAB);
       rot.keyRelease(KeyEvent.VK_TAB);
       
       rot.keyPress(KeyEvent.VK_ENTER);
       rot.keyRelease(KeyEvent.VK_ENTER);
       
       
       
       
       
	}

}
