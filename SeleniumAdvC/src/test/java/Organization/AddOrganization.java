package Organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_Utility.Excel_Utility;
import Generic_Utility.webdriver_Utility;
import POM.CreateOrganization;
import POM.HomePage;
import POM.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddOrganization {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
//		webdriver_Utility web=new webdriver_Utility();
//		web.getWindowMax(driver);
//	    web.getImplicityWait(driver);
		
		String old = driver.getWindowHandle();
		FileInputStream file=new FileInputStream("./src/test/resources/commondata");
		Properties pro=new Properties();
		pro.load(file);
		
		String URl = pro.getProperty("url");
		String uname = pro.getProperty("name");
		String upassword = pro.getProperty("password");
		
		driver.get(URl);
		//POM
		LoginPage login=new LoginPage(driver);
		login.logintoadd(uname, upassword);
//		driver.findElement(By.name("user_name")).sendKeys(pro.getProperty("name"),
//				Keys.TAB,pro.getProperty("password"),Keys.TAB.ENTER);
		
		HomePage home=new HomePage(driver);
		home.gethomelink();
//		driver.findElement(By.linkText("Organizations")).click();
//		driver.findElement(By.xpath("//*[@title='Create Organization...']")).click();
		
		Excel_Utility ex=new Excel_Utility();
		String output = ex.getExceldata(0, 1, 0);
//		FileInputStream file1=new FileInputStream("./src/test/resources/Vtiger.xlsx");
//		Workbook book = WorkbookFactory.create(file1);
//		Sheet sheet = book.getSheetAt(0);
//		Row row = sheet.getRow(1);
//		Cell cell = row.getCell(0);
//		String output = cell.getStringCellValue();
		
		driver.findElement(By.name("accountname")).sendKeys(output);
		
//		driver.findElement(By.xpath("//*[@title='Select']")).click();
		
		webdriver_Utility web1=new webdriver_Utility();
		web1.getSwitchtowindows(driver);
//		Set<String> newWid = driver.getWindowHandles();
//		Iterator<String> id = newWid.iterator();
//		while(id.hasNext()) {
//			String nextwid = id.next();
//			driver.switchTo().window(nextwid);
//		}
		CreateOrganization org=new CreateOrganization(driver);
		org.getSearchtext();
		org.getbutton();
		org.getclick();
//		driver.findElement(By.name("search_text")).sendKeys("Exports");
//		driver.findElement(By.name("search")).click();
//		driver.findElement(By.linkText("Exports")).click();
		
		web1.getSwitchtoAlertAccept(driver);
//		Alert alt = driver.switchTo().alert();
//		alt.accept();
		
		driver.switchTo().window(old);
		org.getfinalbutton();
//		driver.findElement(By.name("button")).click();
		
		Thread.sleep(3000);
		web1.getSwitchtoAlertAccept(driver);
        
		web1.getquit(driver);
	}

}
