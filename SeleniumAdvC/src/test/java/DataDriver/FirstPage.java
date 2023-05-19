package DataDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstPage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		FileInputStream file=new FileInputStream("./src/test/resources/commondata");
		Properties pro=new Properties();
		pro.load(file);

		String URL = pro.getProperty("url");
//		String NAME = pro.getProperty("name");

		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(pro.getProperty("name"),
				Keys.TAB,pro.getProperty("password"),Keys.TAB.ENTER);
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("(//*[starts-with(@style,'padding-right:0p')])[1]")).click();
		
	    Random ra=new Random();
	    int ranum = ra.nextInt(100);
		 
		FileInputStream fi=new FileInputStream("./src/test/resources/classsheet.xlsx");
		Workbook book = WorkbookFactory.create(fi);
		Sheet sheet = book.getSheetAt(0);
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String value = cell.getStringCellValue()+ranum;
	
		
		driver.findElement(By.name("accountname")).sendKeys(value);
		driver.findElement(By.name("button")).click();
		
		
					}

}
