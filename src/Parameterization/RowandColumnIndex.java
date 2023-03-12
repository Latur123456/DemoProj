package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowandColumnIndex {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream file=new FileInputStream("C:\\Users\\Parmeshwar\\Desktop\\veloci.xlsx");	
		
		//int rowsize = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;
		
	//System.out.println(rowsize);

	
Sheet sh= WorkbookFactory.create(file).getSheet("Sheet1");
  int cell=sh.getRow(0).getLastCellNum();
	
	
	System.out.println(cell);
	}
	

}
  
