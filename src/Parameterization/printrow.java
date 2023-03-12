package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class printrow {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Parmeshwar\\Desktop\\veloci.xlsx");
	
	 Sheet sh= WorkbookFactory.create(file).getSheet("Sheet1");
	int size=sh.getRow(1).getLastCellNum()-1;
	for(int i=0;i<=size;i++)
	{
		String data=sh.getRow(1).getCell(i).getStringCellValue();
	
	System.out.println(data+"");
	}
	
	
	
	}

}
