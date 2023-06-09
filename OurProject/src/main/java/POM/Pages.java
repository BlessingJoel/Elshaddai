package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages {
//	public Pages(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//	}
    
	//DataCenter
		@FindBy(xpath = "(//*[@class='icon-outer'])[1]")
		public static WebElement clickDCFirstElement;
		
	    @FindBy(xpath = "(//*[@class='icon-outer'])[2]")
	    public static WebElement clickDCSecondElement;
	    
	    @FindBy(xpath = "(//*[@class='icon-outer'])[3]")
	    public static WebElement clickDCThirdElement;
	    
	    @FindBy(xpath = "(//*[@class='icon-outer'])[4]")
	    public static WebElement clickDCFourthElement;
	    
	 //DigitalDisplays
	    @FindBy(xpath = "(//*[@class='icon-outer'])[1]")
	    public static WebElement clickDDFirstElement;
	    
	    @FindBy(xpath = "(//*[@class='icon-outer'])[2]")
	    public static WebElement clickDDSecondElement;
	    
	    @FindBy(xpath = "(//*[@class='icon-outer'])[3]")
	    public static WebElement clickDDThirdElement;
	    
	 //Services
	    @FindBy(xpath = "//*[contains(text(),'Laptop Power')]")
	    public static WebElement clickSFirstElement;
	    
	    @FindBy(xpath = "(//*[contains(text(),'Laptop DC')])[1]")
	    public static WebElement clickSSecondElement;
	    
	    @FindBy(xpath = "//*[contains(text(),'Battery Rep')]")
	    public static WebElement clickSThirdElement;
	    
	    @FindBy(xpath = "(//*[contains(text(),'Laptop Key')])[1]")
	    public static WebElement clickSFourthElement;
	    
	    @FindBy(xpath = "(//*[contains(text(),'Broken Scr')])")
	    public static WebElement clickSFifthElement;
	    
	    @FindBy(xpath = "(//*[contains(text(),'Hard Drive U')])")
	    public static WebElement clickSSixthElement;
	    
	    @FindBy(xpath = "(//*[contains(text(),'Hard Drive R')])")
	    public static WebElement clickSSeventhElement;
	    
	    @FindBy(xpath = "(//*[contains(text(),'Power Supply')])")
	    public static WebElement clickSEighthElement;
	    
	    @FindBy(xpath = "(//*[contains(text(),'Laptop Keyboard')])[2]")
	    public static WebElement clickSNenthElement;
	    
	    @FindBy(xpath = "(//*[contains(text(),'Solutions')])[21]")
	    public static WebElement clickSTenthElement;
	    
	    @FindBy(xpath = "(//*[contains(text(),'Benefits')])[2]")
	    public static WebElement clickSEleventhElement;
	    
	//Printing
	    @FindBy(xpath = "(//*[contains(text(),'Standalone for')])")
	    public static WebElement clickPFirstElement;
	    
	    @FindBy(xpath = "(//*[contains(text(),'Small Work')])")
	    public static WebElement clickPSecondElement;
	    
	    @FindBy(xpath = "(//*[contains(text(),'Medium Work')])")
	    public static WebElement clickPThirdElement;
	    
	    @FindBy(xpath = "(//*[contains(text(),'Large Enterprise')])")
	    public static WebElement clickPFourthElement;
	    
	    
	    //user
	    @FindBy(xpath = "//*[text()='Mini Desktop']")
	    public static WebElement clickUFirstElement;
	    
	    @FindBy(xpath = "//*[starts-with(text(),'Micro Tow')]")
	    public static WebElement clickUSecondElement;
	    
	    @FindBy(xpath = "//*[starts-with(text(),'Small Form')]")
	    public static WebElement clickUThirdElement;
	    
	    @FindBy(xpath = "(//*[starts-with(text(),'All in')])[1]")
	    public static WebElement clickUFourthElement;
	    
	    public void getUser1() throws Exception {
	    	clickUFirstElement.click();
	    	Thread.sleep(1000);
	    	clickUSecondElement.click();
	    	Thread.sleep(1000);
	    	clickUThirdElement.click();
	    	Thread.sleep(1000);
	    	clickUFourthElement.click();
	    }
	    
	    @FindBy(xpath = "//*[starts-with(text(),'Everyday')]")
	    public static WebElement clickUFifthElelment;
	    
	    @FindBy(xpath = "//*[starts-with(text(),'Convertible 2')]")
	    public static WebElement clickUSixthEelement;
	    
	    @FindBy(xpath = "//*[starts-with(text(),'Deta')]")
	    public static WebElement clickUseventhElement;
	    
	    @FindBy(xpath = "(//*[starts-with(text(),'All')])[2]")
	    public static WebElement clickUEightElement;
	    
	    public void getUser2() throws Exception {
	    	clickUFifthElelment.click();
	    	Thread.sleep(1000);
	    	clickUSixthEelement.click();
	    	Thread.sleep(1000);
	    	clickUseventhElement.click();
	    	Thread.sleep(1000);
	    	clickUEightElement.click();
	    }
	    
	    @FindBy(xpath = "(//*[@class='img-fluid'])[2]")
	    public static WebElement clickUCricleSecond;
	    
	    @FindBy(xpath = "(//*[@class='img-fluid'])[3]")
	    public static WebElement clickUCricleThird;
	    
	    @FindBy(xpath = "(//*[@class='img-fluid'])[1]")
	    public static WebElement clickUCricleFirst;
	    
	    public void getclilckCricle() throws Exception {
	    	clickUCricleSecond.click();
	    	Thread.sleep(1000);
	    	clickUCricleThird.click();
	    	Thread.sleep(1000);
	    	clickUCricleFirst.click();
	    }
	    
	    @FindBy(xpath = "//*[starts-with(text(),'iPad P')]")
	    public static WebElement clickIpadpro;
	    
	    @FindBy(xpath = "//*[starts-with(text(),'iPad A')]")
	    public static WebElement clickIpadair;
	    
	    @FindBy(xpath = "(//*[starts-with(text(),'iPad')])[3]")
	    public static WebElement clickIpad;
	    
	    @FindBy(xpath = "//*[starts-with(text(),'iPad M')]")
	    public static WebElement clickIpadmini;
	    
	    @FindBy(xpath = "//*[starts-with(text(),'Android T')]")
	    public static WebElement clickAndroid;
	    
	    @FindBy(xpath = "//*[starts-with(text(),'Wind')]")
	    public static WebElement clickWindows;
	    
	    public void getUser3() throws Throwable {
	    	clickIpadpro.click();
	    	Thread.sleep(1000);
	    	clickIpadair.click();
	    	Thread.sleep(1000);
	    	clickIpad.click();
	    	Thread.sleep(1000);
	    	clickIpadmini.click();
	    	Thread.sleep(1000);
	    	clickAndroid.click();
	    	Thread.sleep(1000);
	    	clickWindows.click();
	    }
	    
	    @FindBy(xpath = "//*[starts-with(text(),'Desktop T')]")
	    public static WebElement clickDesktop;
	    
	    @FindBy(xpath = "//*[starts-with(text(),'Mobile T')]")
	    public static WebElement clickMoblie;
	    
	    @FindBy(xpath = "//*[starts-with(text(),'Zero')]")
	    public static WebElement clickZero;
	    
	    @FindBy(xpath = "(//*[starts-with(text(),'All')])[4]")
	    public static WebElement clickAll;
	    
	    public void getUser4() throws Exception {
	    	clickDesktop.click();
	    	Thread.sleep(1000);
	    	clickMoblie.click();
	    	Thread.sleep(1000);
	    	clickZero.click();
	    	Thread.sleep(1000);
	    	clickAll.click();
	    }
	    
	    //3D printer
	    @FindBy(xpath = "(//*[contains(@class,'icon-o')])[1]")
	    public static WebElement clickPUfirst;
	    
	    @FindBy(xpath = "(//*[contains(@class,'icon-o')])[2]")
	    public static WebElement clickPUsecond;
	    
	    @FindBy(xpath = "(//*[contains(@class,'icon-o')])[3]")
	    public static WebElement clickPUthird;
	    
	    @FindBy(xpath = "(//*[contains(@class,'icon-o')])[4]")
	    public static WebElement clickPUfourth;
	    
	    public void getPrinterfirst() throws InterruptedException {
	    	clickPUfirst.click();
	    	Thread.sleep(1000);
	    	clickPUsecond.click();
	    	Thread.sleep(1000);
	    	clickPUthird.click();
	    	Thread.sleep(1000);
	    	clickPUfourth.click();
	    }
	    
	    @FindBy(xpath = "(//*[contains(@class,'icon-o')])[5]")
	    public static WebElement clickHPfirst;
	    
	    @FindBy(xpath = "(//*[contains(@class,'icon-o')])[6]")
	    public static WebElement clickHPsecond;
	    
	    @FindBy(xpath = "(//*[contains(@class,'icon-o')])[7]")
	    public static WebElement clickHpthird;
	    
	    @FindBy(xpath = "(//*[contains(@class,'icon-o')])[8]")
	    public static WebElement clickHPfourth;
	    
	    @FindBy(xpath = "(//*[contains(@class,'icon-o')])[9]")
	    public static WebElement clickHPfifth;
	    
	    
	    public void getPrintersecond() throws Exception {
	    	clickHPfirst.click();
	    	Thread.sleep(1000);
	    	clickHPsecond.click();
	    	Thread.sleep(1000);
	    	clickHpthird.click();
	    	Thread.sleep(1000);
	    	clickHPfourth.click();
	    	Thread.sleep(1000);
	    	clickHPfifth.click();
	    }
	    
	    @FindBy(xpath = "(//*[contains(@class,'icon-o')])[10]")
	    public static WebElement clickOPfirst;
	    
	    @FindBy(xpath = "(//*[contains(@class,'icon-o')])[11]")
	    public static WebElement clickOPsecond;
	    
	    @FindBy(xpath = "(//*[contains(@class,'icon-o')])[12]")
	    public static WebElement clickOPthird;
	    
	    @FindBy(xpath = "(//*[contains(@class,'icon-o')])[13]")
	    public static WebElement clickOPfourth;
	    
	    @FindBy(xpath = "(//*[contains(@class,'icon-o')])[14]")
	    public static WebElement clickOPfifth;
       
	    
	    public void getPrinterthird() throws Exception {
	    	clickOPfirst.click();
	    	Thread.sleep(1000);
	    	clickOPsecond.click();
	    	Thread.sleep(1000);
	    	clickOPthird.click();
	    	Thread.sleep(1000);
	    	clickOPfourth.click();
	    	Thread.sleep(1000);
	    	clickOPfifth.click();
	    }
	    
	    @FindBy(xpath = "(//*[contains(@class,'icon-o')])[15]")
	    public static WebElement clickBPfirst;
	    
	    @FindBy(xpath = "(//*[contains(@class,'icon-o')])[16]")
	    public static WebElement clickBPsecond;
	    
	    @FindBy(xpath = "(//*[contains(@class,'icon-o')])[17]")
	    public static WebElement clickBPthird;
	    
	    @FindBy(xpath = "(//*[contains(@class,'icon-o')])[18]")
	    public static WebElement clickBPfourth;
	    
	    @FindBy(xpath = "(//*[contains(@class,'icon-o')])[19]")
	    public static WebElement clickBPfifth;
	    
	    public void getPrinterfourth() throws Exception {
	    	clickBPfirst.click();
	    	Thread.sleep(1000);
	    	clickBPsecond.click();
	    	Thread.sleep(1000);
	    	clickBPthird.click();
	    	Thread.sleep(1000);
	    	clickBPfourth.click();
	    	Thread.sleep(1000);
	    	clickBPfifth.click();
	    }
}
	    
