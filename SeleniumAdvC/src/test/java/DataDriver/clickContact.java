package DataDriver;

import java.io.FileInputStream;

import java.util.Properties;

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


import io.github.bonigarcia.wdm.WebDriverManager;

public class clickContact {

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
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("(//*[starts-with(@style,'padding-right:0px;')])[1]")).click();
		
		FileInputStream f=new FileInputStream("./src/test/resources/classsheet.xlsx");
		Workbook book = WorkbookFactory.create(f);
		Sheet sheet = book.getSheetAt(0);
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		
		String output = cell.getStringCellValue();
		
		
		driver.findElement(By.name("lastname")).sendKeys(output);
		driver.findElement(By.name("button")).click();
		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//*[starts-with(@style,'padding: 0px')])[1]")).click();	
//		driver.findElement(By.linkText("Sign Out")).click();



	}

}
