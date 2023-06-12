package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
	public Header(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
   @FindBy(xpath = "(//*[starts-with(text(),'H')])[1]")
   private WebElement clickHome;
   
   @FindBy(xpath = "(//*[starts-with(text(),'A')])[1]")
   private WebElement clickAbout;
   
   //Solutions
   @FindBy(xpath = "(//*[starts-with(text(),'Solution')])[1]")
   private WebElement clickSolution;
   
   @FindBy(xpath = "(//*[starts-with(text(),'Active')])[1]")
   private WebElement clickActive;
   
   @FindBy(xpath = "(//*[starts-with(text(),'Passive')])[1]")
   private WebElement clickPassive;
   
   @FindBy(xpath = "(//*[starts-with(text(),'Network')])[1]")
   private WebElement clickNsolution;
   
   @FindBy(xpath = "(//*[starts-with(text(),'Cyber')])[1]")
   private WebElement clickCyber;
   
   @FindBy(xpath = "(//*[starts-with(text(),'Data Security')])[1]")
   private WebElement clickData;
   
   @FindBy(xpath = "(//*[starts-with(text(),'Network Se')])[1]")
   private WebElement clickNsecurity;
   
   @FindBy(xpath = "(//*[starts-with(text(),'End')])[1]")
   private WebElement clickEndpoint;
   
   @FindBy(xpath = "(//*[starts-with(text(),'Digital')])[1]")
   private WebElement clickDigital;
   
   @FindBy(xpath = "(//*[starts-with(text(),'Video')])[1]")
   private  WebElement clickVideo;
   
   @FindBy(xpath = "(//*[starts-with(text(),'Projectors')])[1]")
   private WebElement clickProjectors;
   
   @FindBy(xpath = "(//*[starts-with(text(),'Interactive')])[1]")
   private WebElement clickInteractive;
   
   @FindBy(xpath = "(//*[starts-with(text(),'Commercial')])[1]")
   private WebElement clickCommercial;
   
   @FindBy(xpath = "(//*[starts-with(text(),'Services')])[1]")
   private WebElement clickServices;
   
   @FindBy(xpath = "(//*[starts-with(text(),'Camera')])[1]")
   private WebElement clickCamera;
   
   @FindBy(xpath = "(//*[starts-with(text(),'Printing')])[1]")
   private WebElement clickPrinting;
   
   @FindBy(xpath = "(//*[starts-with(text(),'Laser')])[1]")
   private WebElement clickLaser;
   
   @FindBy(xpath = "(//*[starts-with(text(),'User')])[1]")
   private WebElement clickUser;
   
   @FindBy(xpath = "(//*[starts-with(text(),'Desktop')])[1]")
   private WebElement clickDesktop;
   
   @FindBy(xpath = "(//*[starts-with(text(),'Accessories')])[1]")
   private WebElement clickAccessories;
   
   @FindBy(xpath = "(//*[starts-with(text(),' Hard')])[1]")
   private WebElement clickHard;
   
   //Software
   @FindBy(xpath = "(//*[starts-with(text(),'Software')])[1]")
   private WebElement clickSoftware;
   
   @FindBy(xpath = "(//*[starts-with(text(),'Software')])[2]")
   private WebElement clickDSoftare;
   
   @FindBy(xpath = "(//*[contains(text(),'3D')])[1]")
   private WebElement click3D;
   
   //Contact Us
   @FindBy(xpath = "(//*[starts-with(text(),'Contact')])[1]")
   private WebElement clickContact;
   
   @FindBy(xpath = "//*[starts-with(@class,'scroll')]")
   private WebElement clickArrow;
   
   //Contact Pop
   @FindBy(xpath = "//*[contains(@id,'popup')]")
   private WebElement clickcontactPop;
   
   public void getclickHome() {
	   clickHome.click();
	   clickAbout.click();
    }
   //Solutions
   public void getclickSolution() {
	   clickSolution.click();
	   
   }
   public void getclickActive() {
	   clickActive.click();
   }
   public void getclickPassive() {
	   clickPassive.click();
   }
   public void getclickNetwork() {
	   clickNsolution.click();
   }
   public void getclickCyber() {
	   clickCyber.click();
   }
   
   public void getclickData() {
	   clickData.click();
   }
   
   public void getclickNsecurity() {
	   clickNsecurity.click();
   }
   
   public void getclickEndpoint() {
	   clickEndpoint.click();
   }
   
   public void getclickDigital() {
	   clickDigital.click();
   }
   
   public void getclickVideo() {
	   clickVideo.click();
   }
   
   public void getclickProjectors() {
	   clickProjectors.click();
   }
   
   public void getclickInteractive() {
	   clickInteractive.click();
   }
   
   public void getclickCommercial() {
	   clickCommercial.click();
   }
   
   public void getclickServices() {
	   clickServices.click();
   }
   
   public void getclickCamera() {
	   clickCamera.click();
   }
   
   public void getclickPrinting() {
	   clickPrinting.click();
   }
   
   public void getclickLaser() {
	   clickLaser.click();
   }
   
   public void getclickUser() {
	   clickUser.click();
	   
   }
   public void getclickDesktop() {
		   clickDesktop.click();  
   }
   
   public void getclickAccess() {
	   clickAccessories.click();
   }
   
   public void getclickHard() {
	   clickHard.click();
   }
   //Software
   public void getclickSoftware() {
	   clickSoftware.click();
   }
   public void getclickDSoftware() {
	   clickDSoftare.click();
   }
   
   public void getclick3D() {
	   click3D.click();
   }
   
   //Contact  
   public void getclickContact() {
	   clickContact.click();
   }
   
   public void getclickArrow() {
	   clickArrow.click();
   }
   
   //ContactPop
   public void getclickContactPop() {
	   clickcontactPop.click();
   }
   
}