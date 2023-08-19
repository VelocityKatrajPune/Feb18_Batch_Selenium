package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create object of FileInputStream class
		
		FileInputStream myFile= new FileInputStream("D:\\Velocity\\Java Class\\18Feb Morning\\18FebExcelTest.xlsx");
			
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");

		//read whole row
		for(int i=0;i<=2;i++)
		{
			String value = mySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+" ");
		}
		
		System.out.println();
		//read whole column
		
		for(int i=0;i<=3;i++)
		{
			String value = mySheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
		
		
		
		
		
	}

}
