package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	
	public String getExceldata(int sheet,int row,int cell) throws Throwable, IOException {
		FileInputStream file=new FileInputStream("./src/test/resources/Vtiger.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet sh = book.getSheetAt(sheet);
		Row r = sh.getRow(row);
		Cell c = r.getCell(cell);
		String get = c.getStringCellValue();
		return get;
	}
	//AddOrganization
	public String excelFormat(int sheet,int row,int cell) throws Throwable {
		FileInputStream file=new FileInputStream("./src/test/resources/Vtiger.xlsx");
		Workbook book = WorkbookFactory.create(file);
	    DataFormatter format=new DataFormatter();
	   String Exceldata = format.formatCellValue(book.getSheetAt(sheet).getRow(row).getCell(cell));
	   return Exceldata;
	}
}
