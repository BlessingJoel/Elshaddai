package Campaigns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickCompaigns {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		FileInputStream file=new FileInputStream("./src/test/resources/commondata");
		Properties pro=new Properties();
		pro.load(file);
		
		String URL = pro.getProperty("url");
		driver.get(URL);
		
		driver.findElement(By.name("user_name")).sendKeys(pro.getProperty("name"),Keys.TAB,pro.getProperty("password"),
				Keys.TAB.ENTER);
		
		WebElement hover = driver.findElement(By.xpath("(//*[@href='javascript:;'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(hover).perform();
		
		driver.findElement(By.name("Campaigns")).click();
		driver.findElement(By.xpath("(//*[starts-with(@style,'padding-right:0px;')])[1]")).click();
		
		Random ran=new Random();
		int a = ran.nextInt(100);
		FileInputStream file1=new FileInputStream("./src/test/resources/classsheet.xlsx");
		Workbook book = WorkbookFactory.create(file1);
		Sheet sheet = book.getSheetAt(0);
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String getexcel = cell.getStringCellValue();
		
		driver.findElement(By.name("campaignname")).sendKeys(getexcel+a);
		driver.findElement(By.name("button")).click();
		
		 String equal = driver.findElement(By.className("dvHeaderText")).getText();
				
		if(equal.contains(getexcel)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		driver.findElement(By.xpath("(//*[starts-with(@style,'padding: 0px')])[1]")).click();	
		driver.findElement(By.linkText("Sign Out")).click();
 
	}

}
