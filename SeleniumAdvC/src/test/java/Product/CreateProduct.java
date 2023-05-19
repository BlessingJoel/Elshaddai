package Product;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProduct {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
       
		
		FileInputStream file=new FileInputStream("./src/test/resources/commondata");
		Properties pro=new Properties();
		pro.load(file);

		String URl = pro.getProperty("url");
		driver.get(URl);
		driver.findElement(By.name("user_name")).sendKeys(pro.getProperty("name"),
				Keys.TAB,pro.getProperty("password"),Keys.TAB.ENTER);
		driver.findElement(By.xpath("(//*[text()='Products'])[1]")).click();
		driver.findElement(By.xpath("//*[@title='Create Product...']")).click();
        
		Random ran=new Random();
		int r = ran.nextInt(88);
		FileInputStream file1=new FileInputStream("./src/test/resources/classsheet.xlsx");
		Workbook book = WorkbookFactory.create(file1);
		Sheet sheet = book.getSheetAt(0);
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String getdata = cell.getStringCellValue()+r;
		
		driver.findElement(By.name("productname")).sendKeys(getdata);
	
		driver.findElement(By.name("button")).click();
		WebElement hover = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td[3]/table/tbody/tr/td[2]/img"));
		Actions act=new Actions(driver);
		act.moveToElement(hover).perform();
		driver.findElement(By.xpath("//*[text()='Sign Out']")).click();

	}

}
