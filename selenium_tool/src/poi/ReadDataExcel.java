package poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook wb = WorkbookFactory.create(new FileInputStream("./testData/input.xlsx"));
		Sheet s = wb.getSheet("sheet1");
		Row r = s.getRow(1);
		Cell c1 = r.getCell(0);
		String un = c1.getStringCellValue();
		System.out.println(un);
		
		

	}

}
