package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class printalldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Parmeshwar\\Desktop\\veloci.xlsx");
	
	 Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
	     
	  int rowsize = sh.getLastRowNum();
	     System.out.println(rowsize);         
	   CellType ct=sh.getRow(0).getCell(3).getCellType();
	  System.out.println(ct);
	  CellType ct1=sh.getRow(0).getCell(3).getCellType();
	System.out.println(ct1);
	for(int i=0;i<=rowsize;i++)   //outer loop ---row
	{
		int colsize=sh.getRow(i).getLastCellNum()-1;
		for(int j=0;j<=colsize;j++) //inner loop -----col
		{
			 String value=sh.getRow(i).getCell(j).getStringCellValue();
		
		       System.out.print(value+" ");
		}
	}
	    System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
