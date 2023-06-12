package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[contains(text(),'Datacenter')])[2]")
	private WebElement clickdata;
	
	@FindBy(xpath = "(//*[contains(text(),'Digital D')])[4]")
	private WebElement clickdigital;
	
	@FindBy(xpath = "(//*[contains(text(),'Services')])[11]")
	private WebElement clickservices;
	
	@FindBy(xpath = "(//*[contains(text(),'Printing')])[4]")
	private WebElement clickprint;
	
	@FindBy(xpath = "//*[contains(text(),'End User')]")
	private WebElement clickuser;
	
	@FindBy(xpath = "//*[contains(text(),'3D printing')]")
    private WebElement click3d;
	
	@FindBy(xpath = "//*[@class='button-text']")
	private WebElement clickmore;
	
	@FindBy(xpath = "(//*[@class='icon-outer'])[1]")
	private WebElement clicksolutionfirst;
	
	@FindBy(xpath = "(//*[@class='icon-outer'])[2]")
	private WebElement clicksolutionsecond;
	
	@FindBy(xpath = "(//*[@class='icon-outer'])[3]")
	private WebElement clicksolutionthird;
	
	@FindBy(xpath = "(//*[@class='icon-outer'])[4]")
	private WebElement clicksolutionfourth;
	
	@FindBy(xpath = "(//*[@class='icon-outer'])[5]")
	private WebElement clicksolutionfifth;
	
	@FindBy(xpath = "(//*[@class='icon-outer'])[6]")
	private WebElement clicksolutionsixth;
	
	@FindBy(xpath = "(//*[@class='icon-outer'])[7]")
	private WebElement clicksolutionseventh;
	
	@FindBy(xpath = "(//*[@class='icon-outer'])[8]")
	private WebElement clicksolutioneighth;
	
	@FindBy(xpath = "(//*[@class='icon-outer'])[9]")
	private WebElement clicksolutionninth;
	
	public void gethomedata() {
		clickdata.click();
	}
	
	public void gethomedigital() {
		clickdigital.click();
	}
	
	public void gethomeservices() {
		clickservices.click();
	}
	
	public void gethomeprint() {
		clickprint.click();
	}
	
	public void gethomeend() {
		clickuser.click();
	}
	
	public void gethome3d() {
		click3d.click();
	}
	
	public void getmore() {
		clickmore.click();
	}
	
	public void getsolutionfirstline() {
		clicksolutionfirst.click();
		clicksolutionsecond.click();
		clicksolutionthird.click();
		clicksolutionthird.click();
		clicksolutionfourth.click();
		clicksolutionfifth.click();
		clicksolutionsixth.click();
		clicksolutionsixth.click();
		clicksolutionseventh.click();
		clicksolutioneighth.click();
		clicksolutionninth.click();
	}
}
