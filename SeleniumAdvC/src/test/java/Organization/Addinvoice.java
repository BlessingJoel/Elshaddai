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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Addinvoice {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		String old = driver.getWindowHandle();
		FileInputStream file=new FileInputStream("./src/test/resources/commondata");
		Properties pro=new Properties();
		pro.load(file);
		
		String URl = pro.getProperty("url");
		
		driver.get(URl);
		driver.findElement(By.name("user_name")).sendKeys(pro.getProperty("name"),
				Keys.TAB,pro.getProperty("password"),Keys.TAB.ENTER);
		WebElement hover = driver.findElement(By.linkText("More"));
		Actions act=new Actions(driver);
		act.moveToElement(hover).perform();
		
		driver.findElement(By.linkText("Invoice")).click();
		driver.findElement(By.xpath("//*[@title='Create Invoice...']")).click();
		FileInputStream file1=new FileInputStream("./src/test/resources/Vtiger.xlsx");
		Workbook book = WorkbookFactory.create(file1);
		Sheet sheet = book.getSheetAt(0);
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String output = cell.getStringCellValue();
		driver.findElement(By.name("subject")).sendKeys(output);
		
		driver.findElement(By.xpath("(//*[@title='Select'])[3]")).click();
		
		Set<String> neww = driver.getWindowHandles();
		Iterator<String> id = neww.iterator();
		while (id.hasNext()) {
			String wid = id.next();
			driver.switchTo().window(wid);
			}
		driver.findElement(By.name("search_text")).sendKeys("Exports");
		driver.findElement(By.name("search")).click();
		
		driver.findElement(By.linkText("Exports")).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		driver.switchTo().window(old);
		
		driver.findElement(By.name("bill_street")).sendKeys("Udangudi",Keys.TAB,"udangudi");
		driver.findElement(By.xpath("//*[@title='Products']")).click();
		
		Set<String> newww = driver.getWindowHandles();
		Iterator<String> id1 = newww.iterator();
		while(id1.hasNext()) {
			String wid1 = id1.next();
			driver.switchTo().window(wid1);
		}
//		driver.findElement(By.name("search_text")).sendKeys("Aji84");
//		driver.findElement(By.name("search")).click();
		
		driver.findElement(By.xpath("(//*[@class='small'])[4]/tbody//td//*[text()='Aji84']/../preceding-sibling::td")).click();
		driver.findElement(By.xpath("//*[@id=\"ListViewContents\"]/form/table[1]/tbody/tr[1]/td[1]/input")).click();
		driver.switchTo().window(old);
		driver.findElement(By.name("qty1")).sendKeys("8");
        driver.findElement(By.name("button")).click();
		}

}
