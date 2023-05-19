package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganization {
	
	public CreateOrganization(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSearchtext() {
		return searchtext;
	}

//	public WebElement getSearchbutton() {
//		return searchbutton;
//	}

	public WebElement getClicklink() {
		return clicklink;
	}

	@FindBy(name="search_text")
	private WebElement searchtext;
	
	@FindBy(name="search")
	private WebElement searchbutton;
	
	@FindBy(linkText = "Exports")
	private WebElement clicklink;
	
	@FindBy(name = "button")
	private WebElement finalbutton;
	
	public void getsearchtext() {
		searchtext.sendKeys("Exports");
	}
	public void getbutton() {
		searchbutton.click();
	}
	public void getclick() {
		clicklink.click();
	}
	public void getfinalbutton() {
		finalbutton.click();
	}
}
