package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Project_Utility {
	
	public void getScrolldown(WebDriver driver) {
		
		JavascriptExecutor down=(JavascriptExecutor)driver;
		down.executeScript("window.scroll(0,500)", "");
	}
	
	public void getScrollBottom(WebDriver driver) {
	JavascriptExecutor bottom=(JavascriptExecutor)driver;
	bottom.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
	}
	 public void getWindowMax(WebDriver driver) {
		   
			driver.manage().window().maximize();
		}
	 
	 public void getHover(WebDriver driver,WebElement element) {
		 Actions act=new Actions(driver);
		 act.moveToElement(element).build().perform();
	 }
	 
	 public void getspecific(WebDriver driver,WebElement element) {
		 JavascriptExecutor ja=(JavascriptExecutor)driver;
		 ja.executeScript("arguments[0].scrollIntoView(true);", element);
	 }
	 
	 public void getscrollTop(WebDriver driver) {
		 JavascriptExecutor bottom=(JavascriptExecutor)driver;
			bottom.executeScript("window.scrollTo(0,0)", "");
	 }
     
}
