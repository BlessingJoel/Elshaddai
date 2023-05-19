package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Organizations")
	private WebElement Homelink;
	
	@FindBy(xpath = "//*[@title='Create Organization...']")
	private WebElement plusicon;
	
	@FindBy(xpath = "//*[@title='Select']")
	private WebElement Addmember; 

//	public WebElement getHomelink() {
//		return Homelink;
//	}
//
//	public WebElement getPlusicon() {
//		return plusicon;
//	}
	public void gethomelink() {
		Homelink.click();
		plusicon.click();
		Addmember.click();
	}
	
	
}
