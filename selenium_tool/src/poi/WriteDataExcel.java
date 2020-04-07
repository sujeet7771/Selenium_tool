package poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataExcel {

	
	    public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook wb = WorkbookFactory.create(new FileInputStream("./testData/input.xlsx"));
		Cell c = wb.getSheet("S1").createRow(0).createCell(0);
		c.setCellValue("Selenium");
		wb.write(new FileOutputStream("./testData/input.xlsx"));
        System.out.println(wb);

	}

}
