package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream file= new FileInputStream("C:\\Users\\Parmeshwar\\Downloads\\velocity2.xlsx");
		
		 Workbook book=WorkbookFactory.create(file);
		
		    Sheet sh=book.getSheet("Sheet2");
		    Row re=sh.getRow(0);
		    Cell cl= re.getCell(1);
		    String value=cl.getStringCellValue();
		System.out.println(value);
		
		
		
		
	}

}
