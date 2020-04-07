package poissss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingReadData {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
	Workbook wb = WorkbookFactory.create(new FileInputStream("./testData/input.xlsx"));
	Cell c1 = wb.getSheet("Sheet1").getRow(1).getCell(0);
	double count = c1.getNumericCellValue();
	System.out.println(count);
	
		

	}

}
