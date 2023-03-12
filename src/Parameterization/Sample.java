package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Sample {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Parmeshwar\\Downloads\\velocity.xlsx");
		{
			 Workbook book= WorkbookFactory.create(file);
		
		
		     Sheet sh=(Sheet) book.getSheet("Sheet1");
		
		      Row re=((org.apache.poi.ss.usermodel.Sheet) sh).getRow(0);
	 
		Cell cl=re.getCell(0);
		String value =cl.getStringCellValue();
		System.out.println(value);
		
		           
		}
		  
		
	}

}
