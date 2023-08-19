package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream myFile= new FileInputStream("D:\\Velocity\\Java Class\\18Feb Morning\\18FebExcelTest.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");

		
		System.out.println(mySheet.getRow(6).getCell(0).getCellType());
		//System.out.println(mySheet.getRow(6).getCell(0).getNumericCellValue());
		System.out.println(mySheet.getRow(6).getCell(0).getStringCellValue());

	}

}
