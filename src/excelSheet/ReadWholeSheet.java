package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWholeSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//create object of FileInputStream class
		
				FileInputStream myFile= new FileInputStream("D:\\Velocity\\Java Class\\18Feb Morning\\18FebExcelTest.xlsx");
					
				Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
				
				
				//outer for loop --> rows 0-->1
				
				for(int i=0;i<=1;i++)
				{
					//inner for loop--> columns/ cell 0-->2
					for(int j=0;j<=2;j++)
					{
						String value = mySheet.getRow(i).getCell(j).getStringCellValue();
						System.out.print(value+" ");
					}
					System.out.println();
				}
				
				
	}

}
