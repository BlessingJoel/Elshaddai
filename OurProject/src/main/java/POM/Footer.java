package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer {
	
	public Footer(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[contains(text(),'Read')])")
	private WebElement clickreadcontent;
	@FindBy(xpath = "//*[contains(text(),'Data Center Solutions')]")
	private WebElement clickfirstcontent;
	
	@FindBy(xpath = "(//*[contains(text(),'Digital')])[6]")
	private WebElement clicksecondcontent;
	
	@FindBy(xpath = "(//*[contains(text(),'Services')])[10]")
	private WebElement clickthirdcontent;
	
	@FindBy(xpath = "//*[contains(text(),'Printnig')]")
	private WebElement clickfourth;
	
	@FindBy(xpath = "(//*[contains(text(),'User Com')])[4]")
	private WebElement clickfifth;
	
	@FindBy(xpath = "(//*[contains(text(),'Accessories')])[10]")
	private WebElement clicksixth;
	
	@FindBy(xpath = "(//*[contains(text(),'Software')])[7]")
	private WebElement clickseventh;
	
	@FindBy(xpath = "(//*[contains(text(),'3D Printers')])[13]")
	private WebElement clickeight;
	
	@FindBy(xpath = "(//*[contains(text(),'Enquiry')])[1]")
	private WebElement clickenquiry;

	public void getread() {
		clickreadcontent.click();
	}
public void getfirst() {
	clickfirstcontent.click();
}
public void getseond() {
	clicksecondcontent.click();
}
public void getthird() {
	clickthirdcontent.click();
}
	public void getfourth() {
	clickfourth.click();
	}
	
	public void getfifth() {
		clickfifth.click();
	}
	
	public void getsixth() {
		clicksixth.click();
	}
	
	public void getseventh() {
		clickseventh.click();
	}
	
	public void geteight() {
		clickeight.click();
	}
	
	public void getclickEnquiry() {
		clickenquiry.click();
	}
	 
}