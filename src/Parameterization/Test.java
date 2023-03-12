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

public class Test {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream File=new FileInputStream("C:\\Users\\Parmeshwar\\Downloads\\velocity2.xlsx");
		

	           Workbook book=WorkbookFactory.create(File);
	
	           Sheet sh= book.getSheet("Sheet1");
	             Row re=sh.getRow(3);
	              Cell cl=re.getCell(0);
	              String value=cl.getStringCellValue();
	              System.out.println(value);
	}

}
