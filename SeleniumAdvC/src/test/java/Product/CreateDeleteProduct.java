package Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_Utility.Java_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateDeleteProduct {

	public static void main(String[] args) throws Exception {
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
        
//		Random ran=new Random();
//		int r = ran.nextInt(88);
		
        //Genetic Utility 
		Java_Utility ju=new Java_Utility();
		int rannum =ju.getRandomnum();
		
		FileInputStream file1=new FileInputStream("./src/test/resources/classsheet.xlsx");
		Workbook book = WorkbookFactory.create(file1);
		Sheet sheet = book.getSheetAt(0);
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String getdata = cell.getStringCellValue()+rannum;
		
		driver.findElement(By.name("productname")).sendKeys(getdata);
	
		driver.findElement(By.name("button")).click();
		driver.findElement(By.xpath("(//*[text()='Products'])[1]")).click();
		
		driver.findElement(By.xpath("(//*[@class='lvt small']/tbody//td//*[text()='"+getdata+"']/../preceding-sibling::td)[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"massdelete\"]/table/tbody/tr[1]/td/table[2]/tbody/tr/td/input[1]")).click();
        Alert alt = driver.switchTo().alert();
        alt.accept();
        
        List<WebElement> list = driver.findElements(By.xpath("(//*[@class='lvt small']/tbody/tr/td[3])[position()>1]"));
        boolean flag = false;
        for (WebElement wb : list) {
			String act = wb.getText(); 
			if(act.contains(getdata)) {
				flag=true;
				break;
			}
		}
        if(flag) {
        	System.out.println("Deleted");
        }
        else{
        	System.out.println("Not deleted");
        }
	}

}
