package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="user_name")
	private WebElement usernametext;
	
	@FindBy(name="user_password")
	private WebElement passwordtext;
	
	public WebElement getUsernametext() {
		return usernametext;
	}

	public WebElement getPasswordtext() {
		return passwordtext;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	@FindBy(id="submitButton")
	private WebElement loginbutton;
	
	public void logintoadd(String name,String password) {
		usernametext.sendKeys(name);
		passwordtext.sendKeys(password);
		loginbutton.click();
	}
}
