package Classes;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //windowsHandlings
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demo.automationtesting.in/Windows.html");

		driver.findElement(By.xpath("(//*[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//*[text()='click']")).click();

		Set<String> set=driver.getWindowHandles();

		for (String string : set) {
            driver.switchTo().window(string);
            String output=driver.getTitle();
            System.out.println(output);
		}

	}

}
