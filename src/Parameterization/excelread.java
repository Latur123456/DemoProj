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

public class excelread {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("C\"C:\\Users\\Parmeshwar\\Desktop\\veloci.xlsx\"");
	
	
	//  Workbook  opxcel= WorkbookFactory.create(file);
	  //        Sheet sel=opxcel.getSheet("Sheet1");
	    //      Row ur=sel.getRow(3);
	     //     Cell up=ur.getCell(3);
	       //   String name=up.getStringCellValue();
	         // System.out.println(up.getStringCellValue());
	         String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(3) .getStringCellValue();
	  System.out.println(value);
	}

}
